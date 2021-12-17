package be.technocite.ecar.car.converter;

import be.technocite.ecar.car.model.Car;
import be.technocite.ecar.carapi.dto.CarRetailerDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarRetailerConverter implements Function<Car, CarRetailerDto> {
    @Override
    public CarRetailerDto apply(Car car) {
        return new CarRetailerDto(
                car.getId(),
                car.getBrand(),
                car.getMarketPrice(),
                car.getOriginalPrice(),
                car.getVin(),
                car.getYear()
        );
    }
}