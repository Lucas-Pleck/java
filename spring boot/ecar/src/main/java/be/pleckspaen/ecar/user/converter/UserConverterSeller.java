package be.pleckspaen.ecar.user.converter;

import be.pleckspaen.ecar.car.converter.CarConverterSeller;
import be.pleckspaen.ecar.carapi.dto.CarDtoSeller;
import be.pleckspaen.ecar.user.modele.User;
import be.pleckspaen.ecar.userapi.dto.UserDtoSeller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class UserConverterSeller implements Function<User, CarDtoSeller> {

    @Autowired
    private CarConverterSeller carConverterSeller;

    @Override
    public UserDtoSeller apply(User user) {
        return new UserDtoSeller(user.getId(),
                user.getFirstname(),
                user.getUserType(),
                user.getFavoriteCars().stream()
                        .map(carConverterSeller)
                        .collect(Collectors.toList()));
    }
}
