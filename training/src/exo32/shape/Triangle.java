package exo32.shape;

public class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double aire() {
        double base;
        if (sideC > sideB && sideC > sideB) {
            base = sideC;
        } else if (sideB > sideA && sideB > sideC) {
            base = sideB;
        } else {
            base = sideA;
        }
        return (base*height) /2;
    }
}
