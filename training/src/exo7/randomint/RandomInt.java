package exo7.randomint;

public class RandomInt {
    public static void main(String args[]) {
        int nbr = getRandomNumberInRange(1,1600);
        System.out.println(nbr);
        if (nbr%2==0){
            System.out.println("divisible par 2");
        }
        if (nbr%3==0){
            System.out.println("divisible par 3");
        }
        if (nbr%5==0){
            System.out.println("divisible par 5");
        }
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

}
