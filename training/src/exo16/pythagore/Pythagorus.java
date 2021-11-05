package exo16.pythagore;

public class Pythagorus {
    public static void main(String[] args) {
        System.out.print(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n","nb1","nb2","nb3"," ","nb1 pow2","nb2 pow2","nb3 pow2"));
        for(int i=8;i>0;i--){
            int nb1=getRandomNumberInRange(1,100);
            int nb2=getRandomNumberInRange(1,100);
            double nb3=Math.pow(nb1,2)+Math.pow(nb2,2);
            System.out.print(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",nb1,nb2,(int)Math.sqrt(nb3)," ",(int)Math.pow(nb1,2),(int)Math.pow(nb2,2),(int)nb3));
        }
    }
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
