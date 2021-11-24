package exo60.lambdaExpression1;

public class Main {
    public static void main(String[] args) {
        Country belgique =new Country("Belgique");

        belgique.addCity(new City("Mons"));
        belgique.addCity(new City("Bruxelles"));
        belgique.addCity(new City("Waterloo"));
        belgique.addCity(new City("Tubize"));
        belgique.addCity(new City("Gent"));
        belgique.addCity(new City("Antwerpen"));

        System.out.println(belgique.getCities());

        belgique.SortCities();

        System.out.println(belgique.getCities());
    }
}
