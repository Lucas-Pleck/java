package exo33.civilState;

import java.util.Objects;

public class People implements CivilState{
    String numeroRegistreNational;
    String name;

    @Override
    public String toString() {
        return "People{" +
                "numeroRegistreNational='" + numeroRegistreNational + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(numeroRegistreNational, people.numeroRegistreNational) && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroRegistreNational, name);
    }

    @Override
    public String getNumeroRegistreNational() {
        return null;
    }
}
