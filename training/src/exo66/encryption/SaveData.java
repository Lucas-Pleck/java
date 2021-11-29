package exo66.encryption;

import java.io.*;
import java.util.List;

public class SaveData implements Serializable {

    public static void saveData(String fileEncryptedPath, List<String> encryptedFile) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(fileEncryptedPath));
            for (String line : encryptedFile) {
                out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }
}
