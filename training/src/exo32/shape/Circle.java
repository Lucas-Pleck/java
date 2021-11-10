package exo32.shape;

public class Circle implements Shape{

    private double r;

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double aire() {
        return Math.PI *(Math.pow(r,2));
    }

}
