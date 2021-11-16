package exo40.collections;

public class NotFoundException extends Exception{
    public NotFoundException(Personne personne) {
        super("Personne non trouvée dans l'agenda : " + personne.toString());
    }
    public NotFoundException(String lastName, String firstName) {
        super("Personne non trouvée dans l'agenda : " + lastName + " " + firstName);
    }
}
