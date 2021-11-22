package exo49.designPatternComposite;

public class Remorque implements Composant{
    private int poids;

    public Remorque(int poids) {
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
