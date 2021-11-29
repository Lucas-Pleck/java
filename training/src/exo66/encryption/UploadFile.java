package exo66.encryption;

import gamePendu.Game;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UploadFile implements Serializable {

    public static List<String> loadFile(String filePath) {
        List<String> fileToUpload=new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while (true) {
                String ligne = br.readLine();
                if (ligne == null) {
                    break;
                }
                ligne=ligne.toLowerCase();
                fileToUpload.add(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileToUpload;
    }

}
