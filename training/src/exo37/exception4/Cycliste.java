package exo37.exception4;

import java.util.Objects;

public class Cycliste implements Comparable<Cycliste>{
    private Integer classement;
    private String nom;
    private String prenom;

    public Cycliste(String nom, String prenom, int classement) {
        this.nom=nom;
        this.prenom=prenom;
        this.classement=classement;
    }


    public Integer getClassement() {
        return classement;
    }

    public void setClassement(Integer classement) {
        this.classement = classement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cycliste cycliste = (Cycliste) o;
        return Objects.equals(nom, cycliste.nom) && Objects.equals(prenom, cycliste.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classement, nom, prenom);
    }

    @Override
    public int compareTo(Cycliste o) {
        return this.getClassement().compareTo(getClassement());
    }

    @Override
    public String toString() {
        return "Cycliste{" +
                "classement=" + classement +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public String setPrenom() {
        this.prenom=prenom;
        return null;
    }

    public Integer setClassement() {
        this.classement=classement;
        return null;
    }
}
