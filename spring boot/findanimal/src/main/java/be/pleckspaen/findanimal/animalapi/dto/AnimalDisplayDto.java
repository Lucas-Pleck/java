package be.pleckspaen.findanimal.animalapi.dto;

import be.pleckspaen.findanimal.animal.model.AnimalType;

public class AnimalDisplayDto {
    private AnimalType type;
    private String breed;
    private String color;

    public AnimalDisplayDto(AnimalType type, String breed, String color) {
        this.type = type;
        this.breed = breed;
        this.color = color;
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
}
