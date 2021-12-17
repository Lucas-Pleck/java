package be.pleckspaen.findanimal.animal.model;

public class Animal {

    private AnimalType type;
    private String breed;
    private String color;
    private AnimalState state;

    public Animal(AnimalType type, String breed, String color, AnimalState state) {
        this.type = type;
        this.breed = breed;
        this.color = color;
        this.state = state;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AnimalState getState() {
        return state;
    }

    public void setState(AnimalState state) {
        this.state = state;
    }
}
