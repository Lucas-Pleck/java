package exo26.point;

public class Main {
    public static void main(String[] args) {
        Point point=new Point(5,7);
        Point pointSecond=new Point(8,16);
        System.out.println(point.getX());
        System.out.println(pointSecond.getY());
        point.translate(pointSecond);
        System.out.println(point);
        System.out.println(Point.getcount());
        Point pointThird=new Point(15,6);
        System.out.println(Point.getcount());
        point.xSymetry();
        System.out.println(point);
        pointSecond.ySymetry();
        System.out.println(pointSecond);
        pointThird.centralSymetry();
        System.out.println(pointThird);




    }
}
