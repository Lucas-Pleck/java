package exo54.generic2;

public class Main {
    public static void main(String[] args) {
        CompositeKey<Integer,String> compositeKey1=new CompositeKey<>(1,"coucou");
        CompositeKey<Integer,String> compositeKey2=new CompositeKey<>(2,"Lucas");
        CompositeKey<Boolean,Double> compositeKey3=new CompositeKey<>(true,5.55);

        System.out.println(compositeKey1.equals(compositeKey2));


    }
}
