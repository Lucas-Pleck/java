package exo41.Zoo;

public class Zebras extends Animals{

    private final static String sound = "gasping";
    private Integer stripes;

    public Zebras(String name, Integer weight, Integer stripes) {
        super(name, weight,sound);
        this.stripes=stripes;
    }

    public Integer getStripes() {
        return stripes;
    }

    public void setStripes(Integer stripes) {
        this.stripes = stripes;
    }

    @Override
    public void Food(Animals animals) {

    }

    @Override
    public String toString() {
        return "Zebras{" +
                getName() +" "+ getWeight() + " stripes=" + stripes + " " + Zebras.sound +
                '}';
    }
}
