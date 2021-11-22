package exo49.designPatternComposite;

public class GroupeElectrogene implements Composant{

    private int poids;

    public GroupeElectrogene(int poids) {
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
