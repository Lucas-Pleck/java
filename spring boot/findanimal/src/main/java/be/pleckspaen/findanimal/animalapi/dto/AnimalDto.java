package be.pleckspaen.findanimal.animalapi.dto;

import be.pleckspaen.findanimal.animal.model.AnimalState;
import be.pleckspaen.findanimal.animal.model.AnimalType;

public class AnimalDto {
    private AnimalType type;
    private String breed;
    private String color;
    private AnimalState state;

    public AnimalDto(AnimalType type, String breed, String color, AnimalState state) {
        this.type = type;
        this.breed = breed;
        this.color = color;
        this.state = state;
    }

    public AnimalType getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public AnimalState getState() {
        return state;
    }
}
