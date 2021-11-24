package exo60.lambdaExpression1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Country {
    private String name;
    private List<City> cities=new ArrayList<>();

    public Country(String name) {
        this.name = name;
    }

    public void addCity(City city){
        this.cities.add(city);
    }

    public List<City> getCities() {
        return cities;
    }

    public void SortCities(){
        this.cities.sort(Comparator.comparing(City::getName));

    }
}
