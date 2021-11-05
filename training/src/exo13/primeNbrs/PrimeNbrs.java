package exo13.primeNbrs;
import java.util.Scanner;

public class PrimeNbrs {
    public static void main(String[] args) {
        int reste=0;
        boolean flag = true;
        System.out.print("Enter your number");
        Scanner scannerObject = new Scanner(System.in);
        int nbr = scannerObject.nextInt();

        for(int i=2; i <= nbr/2; i++)
        {
            reste = nbr%i;

            if(reste == 0)
            {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(nbr + " est un nombre premier");
        else
            System.out.println(nbr + " n'est pas un nombre premier");
    }
}




