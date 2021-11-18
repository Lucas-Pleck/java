package exo41.Zoo;

public class Elephants extends Animals {

    private final static String sound = "trumpeting";
    private Boolean tusks;

    public Elephants(String name, Integer weight,Boolean tusks) {
        super(name, weight,sound);
        this.tusks = tusks;
    }

    public Boolean getTusks() {
        return tusks;
    }

    public void setTusks(Boolean tusks) {
        this.tusks = tusks;
    }

    public static void isTusks(Elephants elephants){
        if (elephants.tusks){
            System.out.println("This elephant has tusks");
        }
        else {
            System.out.println("Sadly this elephant has no tusks");
        }


    }

    @Override
    public void Food(Animals animals) {

    }

    @Override
    public String toString() {
        return "Elephants{" +
                getName() + " "+ getWeight() +" tusks=" + tusks + " " + Elephants.sound +
                '}';
    }


}
