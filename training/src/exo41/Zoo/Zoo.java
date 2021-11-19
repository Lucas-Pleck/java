package exo41.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo{
    private ArrayList<Animals> animals;

    public Zoo(Animals animals) {
        this.animals = animals;
    }

    public Zoo() {
       animals=new ArrayList<>();
    }

    public Animals getAnimal(String name) throws AnimalNotFoundException{
        for (Animals animals:this.animals){
            if (animals.getName().equals(name)){
                return animals;
            }
        }
        throw new AnimalNotFoundException(name);
    }
    public void removeAnimal() throws AnimalNotFoundException{
        System.out.println("Enter the name of the animal you want to delete : ");
        Scanner sc = new Scanner(System.in);
        String animalToRemove= sc.next();
        Animals animalToDelete = getAnimal(animalToRemove);

        if (!this.animals.contains(animalToDelete)){
            throw new AnimalNotFoundException(animalToDelete.getName());
        }
        this.animals.remove(animalToDelete);
    }

    public void addAnimal() throws AnimalDoubleException{
        Animals animalToAdd = null;
        System.out.println("1/add Lion");
        System.out.println("2/add Zebra");
        System.out.println("3/add Elephant");
        Scanner sc = new Scanner(System.in);
        String animalType= sc.next();

        if(animalType.equals("1")){
            animalToAdd = createLion();
        }
        if(animalType.equals("2")){
            animalToAdd = createZebra();
        }
        if(animalType.equals("3")){
            animalToAdd = createElephant();
        }

        if (this.animals.contains(animalToAdd)){
            throw new AnimalDoubleException(animalToAdd.getName());
        }
        this.animals.add(animalToAdd);
    }


    public Lions createLion(){
        System.out.println("First add lion name then press enter and add his weight :");
        Scanner sc = new Scanner(System.in);
        String lionName = sc.next();
        Integer lionWeight = sc.nextInt();
        return new Lions(lionName,lionWeight);
    }
    public Zebras createZebra(){
        System.out.println("First add zebra name then press enter and add his weight then enter en add his stripes number :");
        Scanner sc = new Scanner(System.in);
        String zebraName = sc.next();
        Integer zebraWeight = sc.nextInt();
        Integer zebraStripes = sc.nextInt();
        return new Zebras(zebraName,zebraWeight,zebraStripes);
    }
    public Elephants createElephant(){
        System.out.println("First add elephant name then press enter and add his weight then enter en add true or false for tusks presence :\":");
        Scanner sc = new Scanner(System.in);
        String elephantName = sc.next();
        Integer elephantWeight = sc.nextInt();
        Boolean tusks = sc.nextBoolean();
        return new Elephants(elephantName,elephantWeight,tusks);
    }


    public ArrayList<Animals> SortOnWeight(Zoo zoo){
        ArrayList<Animals> animals = new ArrayList<Animals>(this.animals);
        animals.sort(new WeightComparator());
        return animals;
    }

    public ArrayList<Animals> SortOnName() {
        ArrayList<Animals> animals = new ArrayList<Animals>(this.animals);
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
