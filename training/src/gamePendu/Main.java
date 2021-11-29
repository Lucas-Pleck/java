package gamePendu;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Game game;
        System.out.println("Tapez 1: pour commencer une nouvelle partie ou tapez 2 pour démarrer de la partie sauvegardée : ");
        Scanner sc = new Scanner(System.in);
        String firstChoice=sc.next();
            if(firstChoice.equals("2")){
                game = Game.loadGame();
            }
            else{
                System.out.println("Entrez le nom du joueur : ");
                sc = new Scanner(System.in);
                String name = sc.next();
                Player player = new Player(name);
                System.out.println("Bienvenue "+player.getName());

                Dico dico = new Dico();
                dico.loadDico("liste_francais.txt");
                System.out.println("Entrez le nombre minimum de lettre pour le mot à trouver");
                sc = new Scanner(System.in);
                int min = sc.nextInt();
                System.out.println("Entrez le nombre maximum de lettre pour le mot à trouver");
                int max=sc.nextInt();
                dico.restrict(min,max);

                game =new Game(player,dico);
                game.start();
            }
                while (!game.isFinished()){
                    System.out.println("Entrez une lettre pour trouver le mot caché. Il vous reste " + game.getLife() +" essais");
                    System.out.println("Ou entrez '1' pour sauvegarder et quitter le jeu ");
                    System.out.println(game.getWordToFindTemp());
                    Scanner letterToGuess = new Scanner(System.in);
                    String letter = letterToGuess.nextLine();
                    if(letter.equals("1")){
                        game.save();
                        break;
                    }
                    game.play(letter);
                }
                if(game.getLife()<=0) {
                    System.out.println("Vous avez perdu, le mot à trouver était " + game.getWordToFind());
                }
                else {
                    System.out.println("Votre partie a été sauvegardée");
                }
            }





}
