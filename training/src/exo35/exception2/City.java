package exo35.exception2;

public class City {
    String name;
    int habitants;

    public City(String name){
        this.habitants = 1000;
        this.name = name;
    }


    public City(String name, int habitants) throws NbrHabitantsNegativeException, NbrHabitantsNullException {
        this.name = name;
        if(habitants<0){
            throw new NbrHabitantsNegativeException("Error negative number of habitans");
        }
        else if (habitants==0){
            throw new NbrHabitantsNullException("Error null number of habitans");
        }
        this.habitants = habitants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHabitants() {
        return habitants;
    }

    public void setHabitants(int habitants) {
        this.habitants = habitants;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", habitants=" + habitants +
                '}';
    }
}
