package exo23.occurences;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("Please enter a sentence to see the occurences");
        System.out.println("===================================================");
        String phrase = scannerObject.nextLine();
        findOccurences(phrase);

    }

    public static void findOccurences(String phrase){
        for(char letter =(char) 'a' ; letter< 'z';letter++){
            int nbr=0;
            for(int i=0; i<phrase.length();i++){
                char testedLetter=phrase.charAt(i);
                if(letter == testedLetter){
                    nbr++;
                }
            }
            if(nbr>0) {
                System.out.println("there is/are " + nbr + " occurences of letter " + letter);
            }
        }
    }
}
