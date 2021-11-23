package exo51.observer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntegerToTest integer = new IntegerToTest();
        OctalObserver octalObserver = new OctalObserver(integer);
        BinaryObserver binaryObserver = new BinaryObserver(integer);
        HexObserver hexObserver = new HexObserver(integer);
        boolean exit = true;


        while(exit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer to translate in Octal, Binary, Hex : ");
            integer.setInteger(sc.nextInt());
            System.out.println("Do you want to test another integer? yes=true / no=false");
            exit = sc.nextBoolean();
        }
    }
}
