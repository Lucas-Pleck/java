package be.technocite.ecar.car.converter;

import be.technocite.ecar.car.model.Car;
import be.technocite.ecar.carapi.dto.CarBuyerDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarBuyerConverter implements Function<Car, CarBuyerDto>{
    @Override
    public CarBuyerDto apply(Car car) {
        return new CarBuyerDto(
                car.getId(),
                car.getBrand(),
                car.getMarketPrice(),
                car.getVin(),
                car.getYear()
        );
    }
}
