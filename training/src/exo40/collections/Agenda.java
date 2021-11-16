package exo40.collections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Agenda {
    private HashMap<Personne,ArrayList<RendezVous>> agendaHashMap;

    public Agenda(HashMap<Personne, ArrayList<RendezVous>> agendaHashMap) {
        this.agendaHashMap = agendaHashMap;
    }

    public Agenda() {
        agendaHashMap = new HashMap<>();
    }

    public HashMap<Personne, ArrayList<RendezVous>> getAgendaHashMap() {
        return agendaHashMap;
    }

    public void setAgendaHashMap(HashMap<Personne, ArrayList<RendezVous>> agendaHashMap) {
        this.agendaHashMap = agendaHashMap;
    }

    public void addPersonne(Personne personne) throws DoublonException{
        if (!this.agendaHashMap.containsKey(personne)){
            this.agendaHashMap.put(personne,new ArrayList<RendezVous>());
        }
        else {

            throw new DoublonException(personne);
        }
    }

    public void removePersonne(Personne personne) throws NotFoundException{
        if (this.agendaHashMap.containsKey(personne)){
            this.agendaHashMap.remove(personne);
        }
        else {

            throw new NotFoundException(personne);
        }
    }

    public Personne findPersonne(String lastName, String firstName) throws NotFoundException {
        for (Personne personne: this.agendaHashMap.keySet()) {
            if (personne.getFirstname().equals(firstName) && personne.getLastname().equals(lastName)) {
                return personne;
            }
        }
        throw new NotFoundException(lastName, firstName);
    }

    public ArrayList<Personne> trierParPrenom() {
        ArrayList<Personne> personnes = new ArrayList<Personne>(this.agendaHashMap.keySet());
        personnes.sort(new FirstnameComparator());
        return personnes;
    }

    public Set<Personne> getPersonnes(){
        return this.agendaHashMap.keySet();
    }

    public void addRdv(Personne personne, RendezVous rdv) throws DoublonException{
        if (this.agendaHashMap.containsKey(personne) && !this.agendaHashMap.get(personne).contains(rdv)){
            this.agendaHashMap.get(personne).add(rdv);
        }
        else {
            throw new DoublonException(personne);
        }
    }

}
