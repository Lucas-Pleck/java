package be.pleckspaen.ecar.user.modele;

import be.pleckspaen.ecar.car.modele.Car;

import java.util.List;

public class User {

    private static int idIndex;
    private int id;
    private String firstname;
    List<Car> favoriteCars;
    private UserType userType;

    public User(String firstname, UserType userType, List<Car> favoriteCars) {
        idIndex++;
        this.id = idIndex;
        this.firstname = firstname;
        this.userType = userType;
        this.favoriteCars = favoriteCars;
    }

    public User(String firstname, UserType userType) {
        idIndex++;
        this.id = idIndex;
        this.firstname = firstname;
        this.userType = userType;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Car> getFavoriteCars() {
        return favoriteCars;
    }

    public void setFavoriteCars(List<Car> favoriteCars) {
        this.favoriteCars = favoriteCars;
    }

    public static int getIdIndex() {
        return idIndex;
    }

    public static void setIdIndex(int idIndex) {
        User.idIndex = idIndex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
