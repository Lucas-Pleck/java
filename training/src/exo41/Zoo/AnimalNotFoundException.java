package exo41.Zoo;

public class AnimalNotFoundException extends Exception{

    public AnimalNotFoundException(String name) {
        super("Animal name not found " + name.toString());
    }
}
