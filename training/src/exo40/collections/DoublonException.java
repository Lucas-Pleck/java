package exo40.collections;

public class DoublonException extends Exception {
    public DoublonException(Personne personne){
        super( "La personne est déja dans l'agenda : "+personne.toString());
    }
}
