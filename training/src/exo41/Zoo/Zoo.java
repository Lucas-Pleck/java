package exo41.Zoo;

import exo40.collections.FirstnameComparator;
import exo40.collections.Personne;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animals> animals;

    public Zoo(ArrayList<Animals> animals) {
        this.animals = animals;
    }

    public Animals getAnimal(String name) throws AnimalNotFoundException{
        for (Animals animals:this.animals){
            if (animals.getName().equals(name)){
                return animals;
            }
        }
        throw new AnimalNotFoundException(name);
    }


    public void addAnimal(Animals animals) throws AnimalDoubleException{
        if (!this.animals.contains(animals)){
            throw new AnimalDoubleException(animals.getName());
        }
        this.animals.add(animals);
    }

    public void removeAnimal(Animals animals) throws AnimalNotFoundException {
        if (!this.animals.contains(animals)){
            throw new AnimalNotFoundException(animals.getName());
        }
        this.animals.remove(animals);
    }

    public ArrayList<Animals> SortOnWeight() {
        ArrayList<Animals> animals = new ArrayList<Animals>();
        animals.sort(new WeightComparator());
        return animals;
    }

    public ArrayList<Animals> SortOnName() {
        ArrayList<Animals> animals = new ArrayList<Animals>();
        animals.sort(new NameComparator());
        return animals;
    }

     public ArrayList<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animals> animals) {
        this.animals = animals;
    }

}
