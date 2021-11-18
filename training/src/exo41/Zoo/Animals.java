package exo41.Zoo;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private Integer weight;
    private static String sound="";

    public Animals(String name, Integer weight, String sound) {
        this.name = name;
        this.weight = weight;
        Animals.sound= sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public abstract void Food(Animals animals);

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name) && Objects.equals(this.getClass().getSimpleName(),animals.getClass().getSimpleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}

