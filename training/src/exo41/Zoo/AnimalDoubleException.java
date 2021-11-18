package exo41.Zoo;

public class AnimalDoubleException extends Exception{

    public AnimalDoubleException(String name) {

        super("Animal already existing in this category of animal " + name.toString());
    }
}
