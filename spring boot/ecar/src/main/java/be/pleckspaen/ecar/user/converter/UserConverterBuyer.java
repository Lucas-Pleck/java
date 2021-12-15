package be.pleckspaen.ecar.user.converter;

import be.pleckspaen.ecar.car.converter.CarConverterBuyer;
import be.pleckspaen.ecar.user.modele.User;
import be.pleckspaen.ecar.userapi.dto.UserDtoBuyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class UserConverterBuyer implements Function<User, UserDtoBuyer> {

    @Autowired
    private CarConverterBuyer carConverterBuyer;

    @Override
    public UserDtoBuyer apply(User user) {
        return new UserDtoBuyer(user.getId(),
                user.getFirstname(),
                user.getUserType(),
                user.getFavoriteCars().stream()
                        .map(carConverterBuyer)
                        .collect(Collectors.toList()));
    }
}
