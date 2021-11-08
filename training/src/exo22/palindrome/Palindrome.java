package exo22.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("Please enter word to test if it is a palindrome");
        System.out.println("===================================================");
        String word = scannerObject.nextLine();


        System.out.println("the opposite of your word is " + reverseWord(word));
        testWord(word);
    }
    private static void testWord(String word) {
        String reverseWordVar = reverseWord(word);

        if (word.equals(reverseWordVar)) {
            System.out.println("Match, this is a palindrome");
        } else {
            System.out.println("Sorry, this is not a palindrome");
        }
    }

    public static String reverseWord(String word) {
        int length = word.length();
        StringBuffer result = new StringBuffer(length);
        int i;

        for (i = length - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}
