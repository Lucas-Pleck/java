package exo4.ifelse;

import exo02.point.Point;

public class Operators {
    public static void main(String args[]) {
        Point point, secondPoint;
        point = new Point();
        secondPoint = new Point(6,5);
        System.out.println("x=" +point.getX());
        System.out.println("y=" +point.getY());
        System.out.println(secondPoint);

        double a=14.9;
        double b=4;
        b+=a;
        String message = "b = " + a;
        System.out.println(message);

        int i=0;
        i++;
        i++;
        i++;
        i++;
        System.out.println(i);
        i--;
        i--;
        System.out.println(i);

    }
}
