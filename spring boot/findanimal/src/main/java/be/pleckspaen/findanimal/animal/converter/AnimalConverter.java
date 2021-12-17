package be.pleckspaen.findanimal.animal.converter;

import be.pleckspaen.findanimal.animal.model.Animal;
import be.pleckspaen.findanimal.animalapi.dto.AnimalDisplayDto;
import be.pleckspaen.findanimal.animalapi.dto.AnimalDto;
import org.springframework.stereotype.Component;

@Component
public class AnimalConverter {

    public AnimalDto apply(Animal animal){
        return new AnimalDto(
                animal.getType(),
                animal.getBreed(),
                animal.getColor(),
                animal.getState()
        );
    }

    public AnimalDisplayDto applyDisplay(Animal animal){
        return new AnimalDisplayDto(
                animal.getType(),
                animal.getBreed(),
                animal.getColor()
        );
    }

}
