package be.pleckspaen.ecar.userapi.dto;

import be.pleckspaen.ecar.carapi.dto.CarDtoSeller;

import java.util.List;

public class UserDtoSeller extends UserDto {
    List<CarDtoSeller> favoriteCars;

    public UserDtoSeller(int id, String firstname, Enum userType, List<CarDtoSeller> favoriteCars) {
        super(id, firstname, userType);
        this.favoriteCars = favoriteCars;
    }
}
