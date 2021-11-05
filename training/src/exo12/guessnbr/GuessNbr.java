package exo12.guessnbr;


import java.util.Scanner;

public class GuessNbr {
    public static void main(String[] args) {
        double nbrToGuess = getRandomNumberInRange(1, 100);
        double counter = 4;
        double trial = 0;
        System.out.println("pssst number to guess is "+(int)nbrToGuess);
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("Try to guess to random integer between 1 and 100");
        System.out.println("==============================================");
        System.out.print("Enter your first trial: ");
        trial = scannerObject.nextDouble();
        while (trial > 100 || trial < 0) {
            System.out.println("I wait an integer between 1 and 100 - try again please");
            trial = scannerObject.nextDouble();
        }
        if (trial==nbrToGuess){
            System.out.println("Congrats you win");
        }
        else {
            while (trial != nbrToGuess && counter > 0) {
                if (trial > 100 || trial < 0) {
                    System.out.println("I wait an integer between 1 and 100 - try again please");
                    trial = scannerObject.nextDouble();
                }
                System.out.print("You have now " + (int) counter + " trials. Enter your next integer: ");
                trial = scannerObject.nextInt();
                counter--;

            }
            System.out.println("You LOOSE ! The good number is " + (int) nbrToGuess);
        }
    }


    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
