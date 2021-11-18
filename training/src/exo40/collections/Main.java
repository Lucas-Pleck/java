package exo40.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) throws NotFoundException {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int choice=10;
        boolean exit=false;

        do {
            try{
                System.out.println("Bienvenu dans l'agenda");
                System.out.println("Entrez une touche : ");
                System.out.println("0/ Voir l'agenda");
                System.out.println("1/ Ajouter une personne dans l'agenda");
                System.out.println("2/ Effacer une personne");
                System.out.println("3/ Modifier adresse et téléphone d'une personne");
                System.out.println("4/ Afficher l'Agenda trié par prénom");
                System.out.println("5/ Afficher l'Agenda trié par nom");
                System.out.println("6/ Ajouter un rdv a une personne");
                System.out.println("9/ Exit");
                choice=sc.nextInt();
            }
            catch (InputMismatchException ex){
                System.out.println("Entrez un nombre valide svp");
            }
            switch (choice){
                case 0 -> showAgenda(agenda);
                case 1 -> createPersonne(agenda);
                case 2 -> deletePersonne(agenda);
                case 3 -> updatePersonne(agenda);
                case 4 -> showAgendaSortByFirstname(agenda);
                case 5 -> showAgendaSortByLastname(agenda);
                case 6 -> createRdv(agenda);
                case 9 -> exit=true;
            }
        }
        while (!exit);



    }
    private static void createPersonne(Agenda agenda){
        Scanner sc = new Scanner(System.in);
        String lastname, firstname, address, phone;
        System.out.println("Entrer le nom svp : ");
        lastname=sc.next();
        System.out.println("Entrer le prénom svp : ");
        sc.nextLine();
        firstname=sc.next();
        System.out.println("Entrer l'adresse svp : ");
        sc.nextLine();
        address=sc.next();
        System.out.println("Entrer le numéro de téléphone svp : ");
        sc.nextLine();
        phone=sc.next();
        try{
            agenda.addPersonne(new Personne(lastname,firstname,address,phone));
        }
        catch (DoublonException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void deletePersonne(Agenda agenda){
        Scanner sc = new Scanner(System.in);
        String lastname, firstname = null;
        for(Personne personne:agenda.getPersonnes()){
            System.out.println(personne.toString());
        }
        System.out.println("Entrer le nom de la personne a supprimer svp : ");
        lastname=sc.next();
        System.out.println("Entrer le prénom de la personne a supprimer svp : ");
        firstname=sc.next();
        Personne personneToRemove = new Personne(lastname,firstname);
        try{
            agenda.removePersonne(personneToRemove);
        }
        catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void updatePersonne(Agenda agenda) throws NotFoundException {
        Scanner sc = new Scanner(System.in);
        String lastname, firstname, address, phone;
        for(Personne personne:agenda.getPersonnes()){
            System.out.println(personne.toString());
        }
        System.out.println("Entrer le nom de la personne a modifier svp : ");
        lastname=sc.next();
        System.out.println("Entrer le prénom de la personne a modifier svp : ");
        firstname=sc.next();

        Personne personneToModify = agenda.findPersonne(lastname, firstname);

        System.out.println("Entrer l'adresse de la personne a modifier svp : ");
        address=sc.next();
        System.out.println("Entrer le téléphone de la personne a modifier svp : ");
        phone=sc.next();

        personneToModify.setAddress(address);
        personneToModify.setPhone(phone);

    }
    private static void showAgenda(Agenda agenda) {
        for(Personne personne:agenda.getPersonnes()){
            System.out.println(personne.toString());
        }
    }

    private static void showAgendaSortByLastname(Agenda agenda) {
        ArrayList<Personne> sortedAgendaByLastname = new ArrayList<>(agenda.getPersonnes());
        Collections.sort(sortedAgendaByLastname);
        for (Personne personne : sortedAgendaByLastname) {
            System.out.println(personne.toString());
        }
    }

    private static void showAgendaSortByFirstname(Agenda agenda) {
       ArrayList<Personne> sortedAgendaByFirstname = agenda.trierParPrenom();
        for (Personne personne : sortedAgendaByFirstname) {
            System.out.println(personne.toString());
        }
    }

    private static void createRdv(Agenda agenda) throws NotFoundException {
        Personne personneToAddRdv = findPersonne(agenda);

        Scanner sc = new Scanner(System.in);
        String lieu, date, motif;
        System.out.println("Entrer le lieu du rdv svp : ");
        lieu=sc.next();
        System.out.println("Entrer la date du rdv svp : ");
        date=sc.next();
        System.out.println("Entrer le motif du rdv svp : ");
        motif=sc.next();
        try{
            agenda.addRdv(personneToAddRdv, new RendezVous(lieu,date,motif));
        }
        catch (DoublonException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private static Personne findPersonne(Agenda agenda) throws NotFoundException {
        Scanner sc = new Scanner(System.in);
        String lastname, firstname;
        for(Personne personne:agenda.getPersonnes()){
            System.out.println(personne.toString());
        }
        try {
            System.out.println("Entrer le nom de la personne svp : ");
            lastname=sc.next();
            System.out.println("Entrer le prénom de la personne svp : ");
            firstname=sc.next();
            Personne findedPersonne = agenda.findPersonne(lastname,firstname);
            return findedPersonne;
        }
        catch (NotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
