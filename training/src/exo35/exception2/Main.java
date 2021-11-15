package exo35.exception2;

public class Main {
    public static void main(String[] args) {
        try {
            City bruxelles =new City("Bruxelles",-50);
    }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }

}
