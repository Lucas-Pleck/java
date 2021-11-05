package exo10.factorial;

public class Factorial {
    public static void main(String[] args) {
        double nbr = getRandomNumberInRange(0,2000);
        System.out.println(nbr);
        double res=1;
        for (int i=1;i<nbr;i++){
            res *=i;
        }
        System.out.println(res);
    }
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
