package exo40.collections;

import java.util.ArrayList;
import java.util.Objects;

public class RendezVous {
    private String lieu;
    private String date;
    private  String motif;

    public RendezVous(String lieu, String date, String motif) {
        this.lieu = lieu;
        this.date = date;
        this.motif = motif;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "lieu='" + lieu + '\'' +
                ", date='" + date + '\'' +
                ", motif='" + motif + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RendezVous that = (RendezVous) o;
        return Objects.equals(lieu, that.lieu) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lieu, date, motif);
    }
}
