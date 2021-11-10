package exo32.shape;

public class Carre implements Shape{

    private double side;


    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public double aire() {
        return side*side;
    }
}
