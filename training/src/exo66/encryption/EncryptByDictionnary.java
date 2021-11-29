package exo66.encryption;

import java.util.ArrayList;
import java.util.List;

public class EncryptByDictionnary implements EncryptStrategy{
    private String origin = "abcdefghijklmnopqrstuvwxyz";
    private String dest = "zertyuiopqsdfghjklmwxcvbna";

    static List<String> encryptedFile=new ArrayList<>();

    public EncryptByDictionnary() {
    }

    public EncryptByDictionnary(String origin, String dest) {
        this.origin = origin;
        this.dest = dest;
    }

    @Override
    public List<String> encrypt(List<String> fileToEncrypt){
        for (String line: fileToEncrypt){
            String encryptedLine = "";
            for (char c:line.toCharArray()){
                encryptedLine += encryptChar(c);
            }
            encryptedFile.add(encryptedLine);
        }
        return encryptedFile;
    }

    public char encryptChar(char c){
        int index = origin.indexOf(c);
        if(index>-1){
            return dest.charAt(index);
        }
        else {
            return c;
        }
    }



    @Override
    public List<String> decrypt(List<String> fileToDecrypt) {
        for (String line: fileToDecrypt){
            String decryptedLine = "";
            for (char c:line.toCharArray()){
                decryptedLine += decryptChar(c);
            }
            encryptedFile.add(decryptedLine);
        }
        return encryptedFile;
    }

    public char decryptChar(char c) {
        int index = dest.indexOf(c);
        if (index > -1 && index<origin.length()) {
            return origin.charAt(index);
        } else {
            return c;
        }
    }

}
