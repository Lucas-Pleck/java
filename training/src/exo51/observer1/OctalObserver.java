package exo51.observer1;

public class OctalObserver extends Observer{

    public OctalObserver(IntegerToTest integer){
        this.integer = integer;
        integer.attach(this);
    }

    @Override
    public void update() {
        System.out.println(Integer.toOctalString(integer.getInteger()));
    }
}
