package be.technocite.ecar.userapi.dto;

import be.technocite.ecar.user.model.UserType;

public class UserDto {

    private int id;
    private String prenom;
    private UserType type;

    public UserDto(int id, String prenom, UserType type) {
        this.id = id;
        this.prenom = prenom;
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
}
