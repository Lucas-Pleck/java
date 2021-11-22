package exo43.serialization1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name to read please : ");
        String fileNameToRead = sc.nextLine();

        try {
            DataInputStream in = new DataInputStream(new FileInputStream(fileNameToRead));
            while (in.available()>0){
                System.out.println(in.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
