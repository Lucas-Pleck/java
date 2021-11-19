package exo41.Zoo;

// Faire une methode qui renvoie une copie de la liste d'animaux trier sur le poids
// une autre sur le nom
// Ajouter une verification des doublons dans le ajouter

import exo42.Menu.Menu;
import exo42.Menu.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws AnimalDoubleException, AnimalNotFoundException {
        Elephants elephant = new Elephants("Dumbo", 12, true);
        Lions lion = new Lions("Simba", 15);

        Zoo zoo = new Zoo();
        int choice=10;
        boolean exit=false;

        do {
            try{
                ArrayList<MenuItem> items = new ArrayList<MenuItem>(
                        Arrays.asList(
                                new MenuItem("0/ Get an animal by name","info1"),
                                new MenuItem("1/ Add an animal in the zoo","info2"),
                                new MenuItem("2/ Remove an animal in the zoo","info3"),
                                new MenuItem("3/ Modifier adresse et téléphone d'une personne","info4"),
                                new MenuItem("4/ Afficher l'Agenda trié par prénom","info5"),
                                new MenuItem("5/ Afficher l'Agenda trié par nom","info6"),
                                new MenuItem("6/ Ajouter un rdv a une personne","info7"),
                                new MenuItem("9/ Exit","info8")
                        )
                );


                Menu menu = new Menu(items,"Bienvenu dans l'agenda \n Entrez une touche : ");
                choice=items.indexOf(menu.useMenu());
            }
            catch (InputMismatchException ex){
                System.out.println("Entrez un nombre valide svp");
            }
            String name="simba";
            Animals animal = null;
            switch (choice){
                case 0 -> System.out.println(zoo.getAnimal(name));
                case 1 -> zoo.addAnimal();
                case 2 -> zoo.removeAnimal();


                case 9 -> exit=true;
            }
        }
        while (!exit);
    }
}