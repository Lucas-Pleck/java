package exo38.exception5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Facture {

    private static int count = 0;

    private String numFacture;
    private String numTva;
    private double tauxTva;
    private ArrayList<Tache> taches;
    private double ristourne;


    public Facture(String numFacture, String numTva, double tauxTva, ArrayList<Tache> taches, double ristourne) {
        this.numFacture = numFacture;
        this.numTva = numTva;
        this.tauxTva = tauxTva;
        this.taches = taches;
        this.ristourne = ristourne;
        count++;
    }

    public void addRistourne(double addAmount) {
        ristourne += addAmount;
    }

    public double getTotal() {
        double total = 0;
        for (Tache tache: taches) {
            if (tache == null) {
                break;
            }
            total += tache.getMontant();
        }
        total -= ristourne;
        total *= (1 + tauxTva);
        return total;
    }

    public Tache getTache(int index) {
        if (index < 0 || index > taches.size()) {
            System.out.println("Invalid index");
            return null;
        } else {
            return taches.get(index);
        }
    }

    public void addTache(Tache tache) {
        boolean isInclude = false;
        for(Tache includedTache: taches) {
            if (includedTache != null && tache.getNom().equals(includedTache.getNom())) {
                isInclude = true;
                break;
            }
        }
        if (!isInclude) {
            if (taches.size() < 4) {
                taches.add(tache);
            } else {
                System.out.println("NOMBRE DE TACHE MAX ATTEINT");
            }
        }
    }

    public int getTacheCount() {

        return taches.size();
    }

    public void supprimerTache(Tache tache) {
        int index = 0;
        for (Tache includedTache: taches) {
            if (tache.equals(includedTache)) {
                break;
            }
            index++;
        }
        for (int i = index; i < (taches.size() - 1) ; i++) {
            taches.set(i, taches.get(i + 1));
        }
    }

    public static int getCount() {
        return count;
    }

    public Facture clone() {
        return new Facture(
                this.numFacture,
                this.numTva,
                this.tauxTva,
                this.taches,
                this.ristourne
        );
    }

    @Override
    public String toString() {
        return "Facture{" +
                "numFacture='" + numFacture + '\'' +
                ", numTva='" + numTva + '\'' +
                ", tauxTva=" + tauxTva +
                ", taches=" + taches +
                ", ristourne=" + ristourne +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facture facture = (Facture) o;
        return Double.compare(facture.tauxTva, tauxTva) == 0 && Double.compare(facture.ristourne, ristourne) == 0 && Objects.equals(numFacture, facture.numFacture) && Objects.equals(numTva, facture.numTva) && Objects.equals(taches, facture.taches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numFacture, numTva, tauxTva, taches, ristourne);
    }
}
