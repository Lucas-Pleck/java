package exo30.point;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.a = new Point(x1, y1);
        this.b = new Point(x2, y2);
        this.c = new Point(x3, y3);
    }

    public Segment[] sides() {
        Segment[] treeSides = {new Segment(a, b), new Segment(b, c), new Segment(c, a)};
        return treeSides;
    }

    public double Perimeter() {
        double total = 0;
        for (Segment side : sides()) {
            double lenght = side.lenght();
            total = total + lenght;
        }
        return total;
    }


    public boolean isRectangle() {
        Segment a = sides()[0];
        Segment b = sides()[1];
        Segment c = sides()[2];
        Segment hypothenus;
        Segment x;
        Segment z;

        if (a.lenght() > b.lenght() && a.lenght() > c.lenght()) {
            hypothenus = a;
            x = b;
            z = c;
        } else if (b.lenght() > a.lenght() && b.lenght() > c.lenght()) {
            hypothenus = b;
            x = a;
            z = c;
        } else {
            hypothenus = c;
            x = b;
            z = a;
        }
        if (Math.pow(hypothenus.lenght(), 2) == ((Math.pow(x.lenght(), 2))+((Math.pow(z.lenght(), 2))))){
            return true;
        }
        else{
            System.out.println("It's not a rectangle triangle");
            return false;
        }
    }

    public void xSymetry() {
        this.a.setX(-a.getX());
        this.b.setX(-b.getX());
        this.c.setX(-c.getX());
    }

    public void ySymetry() {
        this.a.setY(-a.getY());
        this.b.setY(-b.getY());
        this.c.setY(-c.getY());
    }

    public void centralSymetry() {
        xSymetry();
        ySymetry();
    }

}
