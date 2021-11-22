package exo49.designPatternComposite;

public class Main {
    public static void main(String[] args) {
        Remorque maRemorque = new Remorque(11);
        System.out.println("Le poids de la remorque est de: " + maRemorque.getPoids() + " tonnes");

        Tracteur monTracteur = new Tracteur(8);
        System.out.println("Le poids du tracteur est de: " + monTracteur.getPoids() + " tonnes");

        CamionComposite semiRemorque =new CamionComposite();
        semiRemorque.add(maRemorque);
        semiRemorque.add(monTracteur);
        System.out.println("Le poids du semi-remorque est de: " + semiRemorque.getPoids() + " tonnes");

    }
}
