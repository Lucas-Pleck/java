package exo17.pythagore2;

public class Pythagorus2 {
    public static void main(String[] args) {
        int i=0;
        int tried=0;

        System.out.print(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n","nb1","nb2","nb3"," ","nb1 pow2","nb2 pow2","nb3 pow2"));

        while (i<=8){
            int nb1=getRandomNumberInRange(1,100);
            int nb2=getRandomNumberInRange(1,100);
            int nb3=getRandomNumberInRange(1,100);
            tried++;
            if (Math.pow(nb1,2)+Math.pow(nb2,2)==Math.pow(nb3,2)){
                System.out.print(String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",nb1,nb2,nb3," ",(int)Math.pow(nb1,2),(int)Math.pow(nb2,2),(int)Math.pow(nb3,2)));
                i++;
            }
        }
        System.out.println("number of trials : " +tried);
    }
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
