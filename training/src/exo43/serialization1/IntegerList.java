package exo43.serialization1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IntegerList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name please : ");
        String fileName = sc.nextLine();

        System.out.println("File name is : " +fileName);

        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            int intergerToAdd = 0;

            do {
                System.out.println("Enter an integer to add in the file");
                intergerToAdd = sc.nextInt();

                dataOutputStream.writeInt(intergerToAdd);



            } while (intergerToAdd != 0);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        sc.close();

    }
}
