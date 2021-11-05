package exo11.moyenne;

public class Moyenne {
    public static void main(String[] args) {
        int nbrs=0;
        for (int i=0;i<5;i++){
            int tempnbrs=getRandomNumberInRange(0,100);
            nbrs+=tempnbrs;
            System.out.println(tempnbrs);
        }
        System.out.println("moyenne =" +nbrs/5);
    }
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
