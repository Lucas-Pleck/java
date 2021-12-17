package be.technocite.ecar.car.service;

import be.technocite.ecar.car.converter.CarBuyerConverter;
import be.technocite.ecar.car.converter.CarRetailerConverter;
import be.technocite.ecar.car.dao.ICarDao;
import be.technocite.ecar.car.exception.CarConflictException;
import be.technocite.ecar.car.model.Car;
import be.technocite.ecar.carapi.dto.CarBuyerDto;
import be.technocite.ecar.carapi.dto.CarRetailerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private ICarDao dao; // mon repository
    @Autowired
    private CarBuyerConverter buyerConverter;
    @Autowired
    private CarRetailerConverter retailerConverter;

    public List<CarBuyerDto> getAllCars() {
        return dao.findAll().stream()
                .map(buyerConverter)
                .collect(Collectors.toList());
    }

    public CarBuyerDto getCarBuyerById(int id) {
        return buyerConverter.apply(dao.findById(id));
    }

    public Car getCarById(int id) {
        return dao.findById(id);
    }

    public boolean deleteCar(int id) {
        return dao.delete(id);
    }

    public CarBuyerDto updateCar(CarBuyerDto carDto) {
        Car car = dao.findById(carDto.getId());

        if (car != null) {
            car.setMarketPrice(carDto.getMarketPrice());
            return buyerConverter.apply(dao.save(car));
        } else {
            return null;
        }
    }

    public CarRetailerDto addCar(CarRetailerDto carDto) {
        Car car = dao.findById(carDto.getId());

        if (car != null) {
            throw new CarConflictException(car.getId());
        } else {
            Car entiteDB = dao.save(new Car(
                    carDto.getBrand(),
                    carDto.getOriginalPrice(),
                    carDto.getMarketPrice(),
                    carDto.getVin(),
                    carDto.getYear()
            ));
            return retailerConverter.apply(entiteDB);
        }
    }
}

