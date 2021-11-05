package exo15.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int nbr=getRandomNumberInRange(2,20);
        System.out.println("Random number is : " +nbr);

        int n1=1,n2=2,n3;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(int i=2;i<nbr;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
