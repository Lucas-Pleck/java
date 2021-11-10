package exo31.circle;

public class Circle extends Point{
    double r;


    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public Circle(Point point, double r) {
        super(point.getX(), point.getY());
        this.r = r;
    }

    public void moveCenter(double newX, double newY){
        this.setX(newX);
        this.setY(newY);
    }

    public Point getCenter(){
        return this;
    }

}
