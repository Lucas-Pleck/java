package exo41.Zoo;

public class Lions extends Animals{

    private final static String sound = "roar";


    public Lions(String name, Integer weight) {
        super(name, weight,sound);
    }

    public static void Attack(){
        System.out.println("This lion will kill you");
    }

    public static String Attack2(){
        return "This lion will kill you";
    }

    @Override
    public void Food(Animals animals) {

    }

    @Override
    public String toString() {
        return "Lions{" +
                getName() + " " + getWeight() + " " + Lions.sound+ " "+ Lions.Attack2()+
                '}';
    }


}
