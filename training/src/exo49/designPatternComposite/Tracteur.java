package exo49.designPatternComposite;

public class Tracteur implements Composant{
    private int poids;

    public Tracteur(int poids) {
        this.poids = poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public int getPoids() {
        return this.poids;
    }
}
