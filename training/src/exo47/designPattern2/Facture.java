package exo47.designPattern2;

public class Facture {
    private int price;
    private AffichageStrategy strategy;

    public Facture(int price) {
        this.price = price;
        this.strategy = new AffichageBelgique();
    }

    public void affiche(){
        strategy.Afficher(price);
    }

    public void setStrategy(AffichageStrategy strategy) {
        this.strategy = strategy;
    }
}
