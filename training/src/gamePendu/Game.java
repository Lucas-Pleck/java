package gamePendu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Game implements Serializable {
    private Player player;
    private Dico dico;
    private String wordToFind;
    private String wordToFindTemp;
    private int life = 10;
    private List<String> usedLetters;

    public Game(int life) {
        this.life = life;
    }

    public String getWordToFind() {
        return wordToFind;
    }

    public String getWordToFindTemp() {
        return wordToFindTemp;
    }

    public int getLife() {
        return life;
    }

    public Game(Player player, Dico dico) {
        this.player = player;
        this.dico = dico;
    }

    public void start() {
        wordToFind = dico.getRandomWord().toLowerCase(Locale.ROOT);
        System.out.println("le mot à chercher contient " + wordToFind.length() + " charactères");
        hiddenword();
        usedLetters=new ArrayList<>();
    }

    public void hiddenword() {
        wordToFindTemp = "";
        for (char letter : wordToFind.toCharArray()) {
            wordToFindTemp += "*";
        }
    }

    public void play(String letter) {
        if (letter.length() != 1) {
            System.out.println("Vous ne pouvez rentrer qu'une lettre à la fois!");
        } else {
            usedLetters.add(letter);
            System.out.println("Lettres déjà jouées :"+usedLetters);
            char l = letter.charAt(0);
            if (wordToFind.contains(letter)) {
                String temp = "";
                for (int i = 0; i < wordToFind.length(); i++) {

                    if (l == wordToFind.charAt(i)) {
                        temp += l;
                    } else {
                        temp += wordToFindTemp.charAt(i);
                    }
                }
                wordToFindTemp = temp;
                if (wordToFindTemp.equals(wordToFind)) {
                    System.out.println("Vous avez gagné en trouvant le mot " + wordToFind);
                    this.start();
                }
            } else {
                System.out.println("Vous avez perdu une vie");
                life--;
            }
        }
    }

    public  void save(){
        ObjectOutputStream out=null;
        try {
            out =new ObjectOutputStream(new FileOutputStream("gameSave.dat"));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public boolean isFinished() {
        return life <= 0;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Dico getDico() {
        return dico;
    }

    public void setDico(Dico dico) {
        this.dico = dico;
    }


}
