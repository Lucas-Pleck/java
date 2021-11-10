package exo30.point;

public class Segment {
    private Point a;
    private Point b;

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Segment(double xA, double yA, double xB, double yB) {
        this.a = new Point(xA,yA);
        this.b = new Point(xB,yB);
    }

    public double lenght (){
        double xsquare = Math.pow((a.getX()-b.getX()),2);
        double ysquare = Math.pow((a.getY()-b.getY()),2);
        double lenght = Math.pow((xsquare) + (ysquare),0.5);
        return lenght;
    }

    public void deplaceA(double dx, double dy){
        this.a = new Point(dx,dy);
    }

    public void deplaceB(double dx, double dy){
        this.b = new Point(dx,dy);
    }

    public void xSymetry(){
        this.a.setX(-a.getX());
        this.a.setX(-a.getX());
    }

    public void ySymetry(){
        this.a.setY(-a.getY());
        this.b.setY(-b.getY());
    }

    public void centralSymetry(){
        xSymetry();
        ySymetry();
    }

}
