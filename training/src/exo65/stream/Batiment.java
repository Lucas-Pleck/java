package exo65.stream;

public class Batiment {
        private int surface;
        private int prix;
        private int gareDistance;
        private String localite;
        private TypeBatiment type;

    public Batiment(int surface, int prix, int gareDistance, String localite, TypeBatiment type) {
        this.surface = surface;
        this.prix = prix;
        this.gareDistance = gareDistance;
        this.localite = localite;
        this.type=type;

    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getGareDistance() {
        return gareDistance;
    }

    public void setGareDistance(int gareDistance) {
        this.gareDistance = gareDistance;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public TypeBatiment getType() {
        return type;
    }

    public void setType(TypeBatiment type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "surface=" + surface +
                ", prix=" + prix +
                ", gareDistance=" + gareDistance +
                ", localite='" + localite + '\'' +
                ", type=" + type +
                ", prix/m²=" +prix/surface + '\'' +
                '}';
    }
}
