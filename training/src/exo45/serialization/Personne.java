package exo45.serialization;

import java.io.Serializable;

public class Personne implements Serializable {
    private String lastName;
    private String firstName;
    private String birthDate;
    private String work;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Personne(String lastName, String firstName, String birthDate, String work) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
