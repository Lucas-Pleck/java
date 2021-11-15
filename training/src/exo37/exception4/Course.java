package exo37.exception4;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private String nom;
    private ArrayList<Cycliste> classement;

    public Course(String nom, ArrayList<Cycliste> classement) {
        this.nom = nom;
        this.classement = classement;
    }
    public  Course(String nom){
        this.nom=nom;
        this.classement=new ArrayList<>();
    }
    public void ajouterCycliste(Cycliste cycliste) throws DoublonException{
        if (classement.contains(cycliste)){
            throw new DoublonException(cycliste);
        }
        else {
            this.classement.add(cycliste);
        }
    }
    public void supprimerCycliste(Cycliste cycliste){
        this.classement.remove(cycliste);
    }

    public void remplacerCycliste(int index, Cycliste cycliste){
        this.classement.get(index).setNom(cycliste.getNom());
        this.classement.get(index).setPrenom(cycliste.setPrenom());
        this.classement.get(index).setClassement(cycliste.setClassement());
    }

    public Cycliste getPremier(){
        return this.classement.get(0);
    }
    public Cycliste getDernier(){
        return this.classement.get(-1);
    }
}
