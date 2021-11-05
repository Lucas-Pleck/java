package exo02.point;

public class Main {

    public static void main(String args[]) {
        Point point, secondPoint;
        point = new Point();
        secondPoint = new Point(6,5);
        System.out.println("x=" +point.getX());
        System.out.println("y=" +point.getY());
        System.out.println(secondPoint);
    }
}