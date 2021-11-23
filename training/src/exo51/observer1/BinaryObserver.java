package exo51.observer1;

public class BinaryObserver extends Observer{

    public BinaryObserver(IntegerToTest integer){
        this.integer = integer;
        integer.attach(this);
    }

    @Override
    public void update() {
        System.out.println(Integer.toBinaryString(integer.getInteger()));
    }
}
