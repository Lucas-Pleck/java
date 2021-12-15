package be.pleckspaen.ecar.carapi.controller;

import be.pleckspaen.ecar.car.service.CarService;
import be.pleckspaen.ecar.carapi.dto.CarDtoBuyer;
import be.pleckspaen.ecar.carapi.dto.CarDtoSeller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("${spring.data.rest.base-path}/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<CarDtoBuyer> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("{id}")
    public ResponseEntity<CarDtoBuyer> getCarById(@PathVariable int id) {
        CarDtoBuyer car = carService.getCarById(id);

        if (car != null) return ResponseEntity.ok().body(car);
        else return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CarDtoBuyer> deleteCar(@PathVariable int id) {
        if (carService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    public ResponseEntity<CarDtoBuyer> updateCar(@RequestBody CarDtoBuyer car) {
        if (carService.updateCar(car) != null) {
            return ResponseEntity.accepted().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<CarDtoBuyer> addCar(@RequestBody CarDtoSeller carDto) {
        CarDtoSeller car = carService.addCar(carDto);
        URI newlocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(car.getId()).toUri();
        return ResponseEntity.created(newlocation).build();
    }
}
