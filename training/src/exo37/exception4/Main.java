package exo37.exception4;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Tour de france");
        Cycliste cycliste1 = new Cycliste("Jean", "Jean", 3);
        Cycliste cycliste2 = new Cycliste("Jean", "Jean", 3);
        Cycliste cycliste3 = new Cycliste("Jean3", "Jean3", 1);
        try {
            course.ajouterCycliste(cycliste1);
            course.ajouterCycliste(cycliste2);
            course.ajouterCycliste(cycliste3);

        } catch (DoublonException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
