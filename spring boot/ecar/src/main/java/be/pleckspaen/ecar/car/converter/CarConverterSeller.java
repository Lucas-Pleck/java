package be.pleckspaen.ecar.car.converter;

import be.pleckspaen.ecar.car.modele.Car;
import be.pleckspaen.ecar.carapi.dto.CarDtoSeller;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarConverterSeller implements Function<Car, CarDtoSeller> {

    @Override
    public CarDtoSeller apply(Car car) {
        return new CarDtoSeller(car.getId(), car.getBrand(), car.getMarketPrice(), car.getVin(), car.getYear(), car.getOriginPrice());
    }
}
