package exo26.point;

//        • Un attribut abscisse et un attribut ordonnée
//        • Une méthode qui retourne le nombre de points
//        • Une méthode qui effectue une symétrie orthogonale d’axe X
//        • Une méthode qui effectue une symétrie orthogonale d’axe Y
//        • Une méthode qui effectue une symétrie centrale

public class Point {

    private static int counter=0;

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        increment();
    }

    public Point(){
        this(0,0);
        increment();
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void translate(Point point){
        this.x=point.getX();
        this.y=point.getY();
    }

    public static double distance(Point point,Point pointSecond){
        double xsquare = (Math.pow((point.x-pointSecond.x),2));
        double ysquare = Math.pow((point.y-pointSecond.y),2);
        double distance = Math.pow((xsquare) + (ysquare),0.5);
        return distance;
    }

    public static void increment(){
        counter++;
    }

    public static double getcount(){
        return counter;
    }

    public void xSymetry(){
        this.x=-x;
    }

    public void ySymetry(){
        this.y=-y;
    }

    public void centralSymetry(){
        xSymetry();
        ySymetry();
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Point.counter = counter;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
