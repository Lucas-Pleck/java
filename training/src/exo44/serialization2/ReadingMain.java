package exo44.serialization2;

import java.awt.image.BufferedImageFilter;
import java.io.*;
import java.util.Scanner;

public class ReadingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name to read please : ");
        String fileNameToRead = sc.nextLine();
        Scanner scan=null;
        BufferedReader br=null;
        try {
            scan = new Scanner(new FileReader(fileNameToRead));
            while (scan.hasNextLine()){
                String ligne=scan.nextLine();
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }

        try {
            br = new BufferedReader(new FileReader(fileNameToRead));
            while (true){
                String line = br.readLine();
                System.out.println(line);
                if(line==null){
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
