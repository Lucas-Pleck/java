package be.pleckspaen.ecar.userapi.dto;

import be.pleckspaen.ecar.carapi.dto.CarDtoBuyer;
import be.pleckspaen.ecar.user.modele.UserType;

import java.util.List;

public class UserDtoBuyer extends UserDto {
    List<CarDtoBuyer> favoriteCars;


    public UserDtoBuyer(int id, String firstname, UserType userType, List<CarDtoBuyer> favoriteCars) {
        super(id, firstname, userType);
        this.favoriteCars = favoriteCars;
    }
}
