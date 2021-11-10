package exo33.civilState;

public class Registre {
    private People[] peoples;
    private int counter= 0;

    public Registre(int listSize) {
        this.peoples = new People[listSize];
    }

    public int getNbrPeople(){
        return counter;
    }

    public void addPeople(People people){
        if (this.counter == this.peoples.length){
            System.out.println("Array is full");
        }
        else{
            this.peoples[counter]=people;
            counter++;
        }
    }

}
