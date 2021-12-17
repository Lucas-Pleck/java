package be.technocite.ecar.userapi.dto;

import be.technocite.ecar.carapi.dto.CarBuyerDto;
import be.technocite.ecar.user.model.UserType;

import java.util.List;

public class UserBuyerDto extends UserDto {
    private List<CarBuyerDto> favouriteCars;

    public UserBuyerDto(int id, String prenom, UserType type, List<CarBuyerDto> favouriteCars) {
        super(id, prenom, type);
        this.favouriteCars = favouriteCars;
    }

    public List<CarBuyerDto> getFavouriteCars() {
        return favouriteCars;
    }
}