package exo38.exception5;

import java.util.ArrayList;

public class TacheMain {

    public static void main(String[] args) {
        Facture facture = new Facture("00001", "4564", 0.21, new ArrayList<>(), 2);
        Tache tache = new Tache("Tache1", 200);
        Tache tacheSecond = new Tache("Tache2", 210);
        Tache tacheThird = new Tache("Tache3", 220);
        Tache tacheFourth = new Tache("Tache4", 230);
        facture.addTache(tache);
        facture.addTache(tacheSecond);
        facture.addTache(tacheThird);
        System.out.println(facture);
        facture.supprimerTache(tache);
        System.out.println(facture);
        System.out.println(facture.getTacheCount());
        System.out.println(facture.getTotal());
    }
}
