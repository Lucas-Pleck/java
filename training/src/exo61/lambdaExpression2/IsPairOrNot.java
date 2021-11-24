package exo61.lambdaExpression2;

import java.util.Scanner;
import java.util.function.Function;

public class IsPairOrNot {
    public static void main(String[] args) {
        System.out.println("Entrez un nombre pour tester si ce dernier est pair ou non : ");
        Scanner sc = new Scanner(System.in);
        int nbrToTest = sc.nextInt();

        Function<Integer, Boolean> isPair = nbr -> (nbr%2==0);

        System.out.println(isPair.apply(nbrToTest));





    }
}
