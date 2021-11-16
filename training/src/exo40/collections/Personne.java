package exo40.collections;

import java.util.Objects;

public class Personne implements Comparable <Personne>{
    private String lastname;
    private String firstname;
    private String address;
    private String phone;

    public Personne(String lastname, String firstname, String address, String phone) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.phone = phone;
    }

    public Personne(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(lastname, personne.lastname) && Objects.equals(firstname, personne.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, address, phone);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int compareTo(Personne o) {
        return this.getLastname().compareTo(o.lastname);
    }
}
