package be.pleckspaen.ecar.car.converter;

import be.pleckspaen.ecar.car.modele.Car;
import be.pleckspaen.ecar.carapi.dto.CarDtoBuyer;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarConverterBuyer implements Function<Car, CarDtoBuyer> {

    @Override
    public CarDtoBuyer apply(Car car) {
        return new CarDtoBuyer(car.getId(), car.getBrand(), car.getMarketPrice(), car.getVin(), car.getYear());
    }
}
