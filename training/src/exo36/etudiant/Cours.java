package exo36.etudiant;

public class Cours {

    private Integer year;
    private Integer nbrHeures;
    private String libelle;

    public Cours(Integer year, Integer nbrHeures, String libelle) {
        this.year = year;
        this.nbrHeures = nbrHeures;
        this.libelle = libelle;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(Integer nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public boolean equals(Cours cours) {
        return this.libelle.equals(cours.libelle)
                && this.year.equals(cours.year);
    }
}
