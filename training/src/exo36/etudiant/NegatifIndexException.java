package exo36.etudiant;

public class NegatifIndexException extends Exception {
    public NegatifIndexException() {
        super("Negatif index not allowed");
    }
}
