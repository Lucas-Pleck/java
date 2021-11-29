package exo66.encryption;

import java.util.ArrayList;
import java.util.List;

public class EncryptByGap implements EncryptStrategy {
    private static List<String> encryptedFile=new ArrayList<>();
    private int encryptionLevel;

    public EncryptByGap(int encryptionLevel) {
        this.encryptionLevel = encryptionLevel;
    }

    @Override
    public List<String> encrypt(List<String> fileToEncrypt){
        for (String line: fileToEncrypt){
            String encryptedLine = "";
            for(int i=0;i<line.length();i++){
                encryptedLine += String.valueOf(encryptChar(line.charAt(i)));

            }
            encryptedFile.add(encryptedLine);
        }
        return encryptedFile;
    }

    private char encryptChar(char c){
        return (char) (c +encryptionLevel);
    }


    @Override
    public List<String> decrypt(List<String> fileToEncrypt){
        for (String line: fileToEncrypt){
            String encryptedLine = "";
            for(int i=0;i<line.length();i++){
                encryptedLine += String.valueOf(decryptChar(line.charAt(i)));

            }
            encryptedFile.add(encryptedLine);
        }
        return encryptedFile;
    }

    private char decryptChar(char c){
        return (char) (c -encryptionLevel);
    }

    public static List<String> getEncryptedFile() {
        return encryptedFile;
    }

    public static void setEncryptedFile(List<String> encryptedFile) {
        EncryptByGap.encryptedFile = encryptedFile;
    }

    public int getEncryptionLevel() {
        return encryptionLevel;
    }

    public void setEncryptionLevel(int encryptionLevel) {
        this.encryptionLevel = encryptionLevel;
    }
}
