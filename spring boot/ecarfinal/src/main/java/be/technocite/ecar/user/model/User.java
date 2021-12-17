package be.technocite.ecar.user.model;

import be.technocite.ecar.car.model.Car;

import java.util.List;

public class User {
    private static int idIndex;
    private int id;
    private String prenom;
    private UserType type;
    private List<Car> favouriteCars;

    public User(String prenom, List<Car> favouriteCars, UserType type) {
        idIndex++;
        this.id = idIndex;
        this.prenom = prenom;
        this.favouriteCars = favouriteCars;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public UserType getType() {
        return type;
    }

    public List<Car> getFavouriteCars() {
        return favouriteCars;
    }

    public void setFavouriteCars(List<Car> favouriteCars) {
        this.favouriteCars = favouriteCars;
    }
}
