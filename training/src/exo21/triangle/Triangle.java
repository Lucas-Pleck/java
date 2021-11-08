package exo21.triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int counter=0;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("Please enter a number of row to create the pyramid");
        System.out.println("===================================================");
        int row = scannerObject.nextInt();

        while (counter < row ) {
            for (int i =0; i< row-counter;i++){
                System.out.print(" ");
            }

            for (int i=0;i<(counter+1);i++){
                System.out.print(" ");
                System.out.print("*");

            }
            counter++;
            System.out.println("");
        }

    }
}
