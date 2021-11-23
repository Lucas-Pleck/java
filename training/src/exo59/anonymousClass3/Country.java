package exo59.anonymousClass3;

import java.util.*;

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

    public void sortCities(){
       Collections.sort(this.cities, new Comparator<City>() {
           @Override
           public int compare(City o1, City o2) {
               return o1.getName().compareTo(o2.getName());
           }

       });

    }
}
