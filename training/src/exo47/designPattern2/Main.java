package exo47.designPattern2;

public class Main {
    public static void main(String[] args) {
        AffichageStrategy affichageBelgique =new AffichageBelgique();
        AffichageStrategy affichageAllemagne =new AffichageAllemagne();
        AffichageStrategy affichageRoyaumeUni =new AffichageRoyaumeUni();

        Facture maFacture=new Facture(50);
        System.out.println("Par défaut (Belgique)");
        System.out.println("---------------------");
        maFacture.affiche();


        System.out.println("\nAllemagne");
        System.out.println("---------------------");
        maFacture.setStrategy(new AffichageAllemagne());
        maFacture.affiche();

        System.out.println("\nRoyaume-Uni");
        System.out.println("---------------------");
        maFacture.setStrategy(new AffichageRoyaumeUni());
        maFacture.affiche();

    }

}
