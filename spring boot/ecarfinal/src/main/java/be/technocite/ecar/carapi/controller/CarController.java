package be.technocite.ecar.carapi.controller;

import be.technocite.ecar.car.service.CarService;
import be.technocite.ecar.carapi.dto.CarBuyerDto;
import be.technocite.ecar.carapi.dto.CarRetailerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "${spring.data.rest.base-path}/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<CarBuyerDto> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<CarBuyerDto> getCarById(@PathVariable int id) {
        CarBuyerDto car = carService.getCarBuyerById(id);

        if (car != null) return ResponseEntity.ok().body(car);
        else return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<CarBuyerDto> deleteCar(@PathVariable int id) {
        if (carService.deleteCar(id)) return ResponseEntity.ok().build();
        else return ResponseEntity.notFound().build();
    }

    @PutMapping // étant donné qu'au final seul le marketPrice est modifiable , il aurait été préférable
    // de créer un autre dto qui aurait eu qu'une propriété nommée marketPrice
    public ResponseEntity<CarBuyerDto> updateCar(@RequestBody CarBuyerDto car) {
        if (carService.updateCar(car) != null) return ResponseEntity.accepted().build();
        else return ResponseEntity.badRequest().build();
    }

    @PostMapping
    public ResponseEntity<CarBuyerDto> addCar(@RequestBody CarRetailerDto carDto) {
            CarRetailerDto car = carService.addCar(carDto);
            URI newLocation = ServletUriComponentsBuilder
                    .fromCurrentRequest()// /api/car
                    .path("/{id}") // /api/car/{id}
                    .buildAndExpand(car.getId()) // /api/car/4
                    .toUri(); //crée tout l'uri
            return ResponseEntity.created(newLocation).build();
    }
}
