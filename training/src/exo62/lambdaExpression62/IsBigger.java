package exo62.lambdaExpression62;

import java.util.Scanner;
import java.util.function.BiFunction;

public class IsBigger {
    public static void main(String[] args) {
        System.out.println("Entrez deux nombres pour tester lequel est le plus grand : ");
        Scanner sc = new Scanner(System.in);
        int nbrToTest = sc.nextInt();
        int nbrToTest2 = sc.nextInt();

        BiFunction<Integer,Integer, Boolean> isBigger = (nb1,nb2)-> (nb1>nb2);

        if (isBigger.apply(nbrToTest,nbrToTest2)){
            System.out.println("le nbre1 est plus grand que le deuxième");
        }
        else {
            System.out.println("le nbr2 est plus grand que le premier");
        }
    }
}
