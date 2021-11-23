package exo51.observer1;

public class HexObserver extends Observer{

    public HexObserver(IntegerToTest integer){
        this.integer = integer;
        integer.attach(this);
    }

    @Override
    public void update() {
        System.out.println(Integer.toHexString(integer.getInteger()));
    }
}
