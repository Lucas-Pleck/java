package exo9.calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double firstNbr, secondNbr;
        double result;

        Scanner scannerObject = new Scanner(System.in);
        do {
            System.out.println("==============================================");
            System.out.println("+ for ADDITION");
            System.out.println("- for SUBTRACTION");
            System.out.println("* for MULTIPLICATION");
            System.out.println("/ for DIVISION");
            System.out.println("% for MODULO");
            System.out.println("^ for EXPONENT");
            System.out.println("Q for QUIT");
            System.out.println("==============================================");

            System.out.print("Enter your first number: ");
            firstNbr = scannerObject.nextDouble();

            System.out.print("Enter your second number: ");
            secondNbr = scannerObject.nextDouble();
            System.out.print("Enter an operators (+, -, *, /, %, ^) only: ");

            char operator = scannerObject.next().charAt(0);
            switch (operator) {
                case '+':
                    result = firstNbr + secondNbr;
                    break;
                case '-':
                    result = firstNbr - secondNbr;
                    break;
                case '*':
                    result = firstNbr * secondNbr;
                    break;
                case '/':
                    result = firstNbr / secondNbr;
                    break;
                case '%':
                    result = firstNbr % secondNbr;
                    break;
                case '^':
                    result = Math.pow(firstNbr, secondNbr);
                    break;
                case 'Q':
                    System.exit(0);
                default:
                    System.out.printf("Please stupid boy enter specified operator only");
                    return;
            }
            System.out.println(firstNbr + " " + operator + " " + secondNbr + " is : " + result);
        } while (result != 'Q');
        scannerObject.close();
    }
}

