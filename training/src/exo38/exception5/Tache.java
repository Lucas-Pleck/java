package exo38.exception5;

public class Tache {

    private String nom;
    private double montant;

    public Tache(String nom, double montant) {
        this.nom = nom;
        this.montant = montant;
    }

    public String getNom() {
        return nom;
    }

    public double getMontant() {
        return montant;
    }
}
