package be.technocite.ecar.user.converter;

import be.technocite.ecar.car.converter.CarBuyerConverter;
import be.technocite.ecar.car.converter.CarRetailerConverter;
import be.technocite.ecar.user.model.User;
import be.technocite.ecar.user.model.UserType;
import be.technocite.ecar.userapi.dto.UserBuyerDto;
import be.technocite.ecar.userapi.dto.UserDto;
import be.technocite.ecar.userapi.dto.UserRetailerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

import static java.util.stream.Collectors.toList;

@Component
public class UserConverter implements Function<User, UserDto> {
    @Autowired
    private CarRetailerConverter carRetailerConverter;
    @Autowired
    private CarBuyerConverter carBuyerConverter;

    @Override
    public UserDto apply(User user) {
        if (user.getType().equals(UserType.BUYER)) {
            return new UserBuyerDto(
                    user.getId(),
                    user.getPrenom(),
                    user.getType(),
                    user.getFavouriteCars()
                            .stream()
                            .map(carBuyerConverter)
                            .collect(toList())
            );
        } else {
            return new UserRetailerDto(
                    user.getId(),
                    user.getPrenom(),
                    user.getType(),
                    user.getFavouriteCars()
                            .stream()
                            .map(carRetailerConverter)
                            .collect(toList())
            );
        }
    }
}
