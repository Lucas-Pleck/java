package exo66.encryption;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, press 1 to encrypt and save a file or 2 to decrypt a file :");
        String menuChoice = sc.next();
        if (menuChoice.equals("1")) {
            System.out.println("press 1 to encrypt by gap or 2 to encrypt by dictionnary : ");
            String encryptionChoice = sc.next();
            if (encryptionChoice.equals("1")) {
                System.out.println("Please enter the full name (with extension) of the file you want to encrypt : ");
                String filePath = sc.next();
                List<String> uploadedFile = UploadFile.loadFile(filePath);
                EncryptStrategy myStrategy = new EncryptByGap(15);
                List<String> encryptedFile = myStrategy.encrypt(uploadedFile);
                System.out.println("Please enter the full name (with extension) of the encrypted file you want to save : ");
                String encryptedFilePath = sc.next();
                SaveData.saveData(encryptedFilePath, encryptedFile);
            } else {
                System.out.println("Please enter the full name (with extension) of the file you want to encrypt : ");
                String filePath = sc.next();
                List<String> uploadedFile = UploadFile.loadFile(filePath);
                EncryptStrategy myStrategy = new EncryptByDictionnary();
                List<String> encryptedFile = myStrategy.encrypt(uploadedFile);
                System.out.println("Please enter the full name (with extension) of the encrypted file you want to save : ");
                String encryptedFilePath = sc.next();
                SaveData.saveData(encryptedFilePath, encryptedFile);
            }
        } else if (menuChoice.equals("2")) {
            System.out.println("press 1 to decrypt by gap or 2 to decrypt by dictionnary : ");
            String decryptionChoice = sc.next();
            if (decryptionChoice.equals("1")) {
                System.out.println("Please enter the full name (with extension) of the file you want to decrypt : ");
                String fileTodecrypt = sc.next();
                File f = new File(fileTodecrypt.trim());
                if (f.exists()) {
                    List<String> fileToDecrypt = UploadFile.loadFile(fileTodecrypt);
                    EncryptStrategy myStrategy = new EncryptByGap(15);
                    List<String> decryptedFile = myStrategy.decrypt(fileToDecrypt);
                    System.out.println("Please enter the full name (with extension) of the decrypted file you want to save : ");
                    String decryptedFilePath = sc.next();
                    SaveData.saveData(decryptedFilePath, decryptedFile);
                } else {
                    System.out.println("Sorry this file does not exist");
                }
            }
            else {
                System.out.println("Please enter the full name (with extension) of the file you want to decrypt : ");
                String fileTodecrypt = sc.next();
                File f = new File(fileTodecrypt.trim());
                if (f.exists()) {
                    List<String> fileToDecrypt = UploadFile.loadFile(fileTodecrypt);
                    EncryptStrategy myStrategy = new EncryptByDictionnary();
                    List<String> decryptedFile = myStrategy.decrypt(fileToDecrypt);
                    System.out.println("Please enter the full name (with extension) of the decrypted file you want to save : ");
                    String decryptedFilePath = sc.next();
                    SaveData.saveData(decryptedFilePath, decryptedFile);
                } else {
                    System.out.println("Sorry this file does not exist");
                }
            }
        }
    }
}