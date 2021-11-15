package exo36.etudiant;

public class MaxCoursException extends Exception {
    public MaxCoursException(Integer max) {
        super("Nombre Maximum de cours " + max);
    }
}
