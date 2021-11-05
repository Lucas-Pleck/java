package exo3.operators;

import exo02.point.Point;

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