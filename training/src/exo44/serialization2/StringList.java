package exo44.serialization2;

import java.io.*;
import java.util.Scanner;

public class StringList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name please : ");
        String fileName = sc.nextLine();

        System.out.println("File name is : " +fileName);
        PrintWriter out=null;
        try {
            out = new PrintWriter (new FileWriter(fileName));
            String stringToAdd = "";

            do {
                System.out.println("Enter an string to add in the file");
                stringToAdd = sc.nextLine();

                out.println(stringToAdd);

            } while (!stringToAdd.equals("stop"));

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }

        sc.close();

    }
}
