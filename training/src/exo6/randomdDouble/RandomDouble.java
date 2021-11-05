package exo6.randomdDouble;

public class RandomDouble {
    public static void main(String args[]) {
        double a = Math.random();
        System.out.println("nbr is " + a);
        if (a <= 1 / 5) {
            System.out.println("Between 0 and 0,2");
        }
        else if(a <= 2 / 5) {
            System.out.println("Between 0,2 and 0,4 ");
        }
        else if (a <= 3 / 5) {
            System.out.println("Between 0,4 and 0,6 ");
        }
        else if (a <= 4 / 5) {
            System.out.println("Between 0,6 and 0,8 ");
        }
        else {
            System.out.println("Between 0,8 and 1 ");
        }
    }
}
