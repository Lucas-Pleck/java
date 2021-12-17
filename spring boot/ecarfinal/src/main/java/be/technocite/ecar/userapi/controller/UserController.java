package be.technocite.ecar.userapi.controller;

import be.technocite.ecar.user.service.UserService;
import be.technocite.ecar.userapi.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "${spring.data.rest.base-path}/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping(value = "/{userId}/addFavouriteCar/{carId}")
    public ResponseEntity<UserDto> addCar(@PathVariable int userId, @PathVariable int carId) {
        UserDto userDto = userService.addFavouriteCar(userId, carId);
        return ResponseEntity.ok(userDto);
    }
}
