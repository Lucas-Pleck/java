package be.technocite.ecar.user.service;

import be.technocite.ecar.car.model.Car;
import be.technocite.ecar.car.service.CarService;
import be.technocite.ecar.exception.CarDoesNotExistException;
import be.technocite.ecar.exception.UserDoesNotExistException;
import be.technocite.ecar.user.converter.UserConverter;
import be.technocite.ecar.user.dao.IUserDao;
import be.technocite.ecar.user.model.User;
import be.technocite.ecar.userapi.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class UserService {

    @Autowired
    private IUserDao dao;
    @Autowired
    private CarService carService;
    @Autowired
    private UserConverter userConverter;

    public List<UserDto> getAllUsers() {
        return dao.findAll().stream()
                .map(userConverter)
                .collect(toList());
    }

    public UserDto addFavouriteCar(int userId, int carId) {
        Car car = carService.getCarById(carId);
        User user = dao.findById(userId);
        user.getFavouriteCars().add(car);
        if (car == null) throw new CarDoesNotExistException(car.getId());
        if (user == null) throw new UserDoesNotExistException(user.getId());
        // si les deux existent alors le process continue
        user = dao.save(user);
        return userConverter.apply(user);
    }
}
