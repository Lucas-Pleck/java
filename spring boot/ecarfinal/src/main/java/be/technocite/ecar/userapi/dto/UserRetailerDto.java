package be.technocite.ecar.userapi.dto;

import be.technocite.ecar.carapi.dto.CarRetailerDto;
import be.technocite.ecar.user.model.UserType;

import java.util.List;

public class UserRetailerDto extends UserDto {
    private List<CarRetailerDto> favouriteCars;

    public UserRetailerDto(int id, String prenom, UserType type, List<CarRetailerDto> favouriteCars) {
        super(id, prenom, type);
        this.favouriteCars = favouriteCars;
    }

    public List<CarRetailerDto> getFavouriteCars() {
        return favouriteCars;
    }
}
