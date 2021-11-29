package gamePendu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dico implements Serializable {
    private List<String> dico = new ArrayList<>();
    private String pathDico;

    public Dico() {

    }

    public void loadDico(String pathDico) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathDico));
            while (true) {
                String ligne = br.readLine();
                if (ligne == null) {
                    break;
                }
                dico.add(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRandomWord(){
        Random r = new Random();
        int randomitem = r.nextInt(dico.size());
        return dico.get(randomitem);
    }

    public void restrict(int min, int max) {
        this.dico = this.dico.stream().filter(s -> s.length()>= min && s.length()<=max).toList();
    }


    public List<String> getDico() {
        return dico;
    }

    public void setDico(List<String> dico) {
        this.dico = dico;
    }

    public String getPathDico() {
        return pathDico;
    }

    public void setPathDico(String pathDico) {
        this.pathDico = pathDico;
    }
}

