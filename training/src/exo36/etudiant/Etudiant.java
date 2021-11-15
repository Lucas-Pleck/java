package exo36.etudiant;

public class Etudiant {

    private final static Integer MAX_COURS = 10;

    private String nom;
    private String prenom;
    private Cours[] cours;

    private Integer coursCount = 0;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.cours = new Cours[MAX_COURS];
    }

    public void ajouterCours(Cours cours) throws MaxCoursException, DuplicateCoursException {
        if (coursCount >= MAX_COURS) {
            throw new MaxCoursException(MAX_COURS);
        } else if (isCoursAlreadyIn(cours)) {
            throw new DuplicateCoursException();
        } else {
            this.cours[coursCount] = cours;
            coursCount++;
        }
    }

    public String getCours(Integer index) throws MaxCoursException, NegatifIndexException, OutOfCoursArrayException {
        if (index > MAX_COURS) {
            throw new MaxCoursException(MAX_COURS);
        } else if (index < 0) {
            throw new NegatifIndexException();
        } else if (index < coursCount) {
            throw new OutOfCoursArrayException();
        } else {
            return this.cours[index].getLibelle();
        }
    }

    private boolean isCoursAlreadyIn(Cours cours) {
        for (int i = 0; i < coursCount; i++) {
            // ATTENTION redefinition de la methode equals dans la class Cours
            if (this.cours[i].equals(cours)) {
                return true;
            }
        }
        return false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Cours[] getCours() {
        return cours;
    }

    public void setCours(Cours[] cours) {
        this.cours = cours;
    }

    public Integer getCoursCount() {
        return coursCount;
    }

    public void setCoursCount(Integer coursCount) {
        this.coursCount = coursCount;
    }
}
