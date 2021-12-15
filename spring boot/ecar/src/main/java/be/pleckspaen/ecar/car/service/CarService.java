package be.pleckspaen.ecar.car.service;

import be.pleckspaen.ecar.car.Exception.AddCarConflitException;
import be.pleckspaen.ecar.car.converter.CarConverterBuyer;
import be.pleckspaen.ecar.car.converter.CarConverterSeller;
import be.pleckspaen.ecar.car.dao.ICarDao;
import be.pleckspaen.ecar.car.modele.Car;
import be.pleckspaen.ecar.carapi.dto.CarDtoBuyer;
import be.pleckspaen.ecar.carapi.dto.CarDtoSeller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {


    @Autowired
    private ICarDao dao;

    @Autowired
    private CarConverterBuyer converter;

    @Autowired
    private CarConverterSeller sellerConverter;

    public List<CarDtoBuyer> getAllCars() {
        return dao.findAll().stream().map(converter).collect(Collectors.toList());
    }

    public CarDtoBuyer getCarById(int id) {
        return converter.apply(dao.findById(id));
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public CarDtoBuyer updateCar(CarDtoBuyer carDto) {
        Car car = dao.findById(carDto.getId());
        if (car != null) {
            car.setMarketPrice(carDto.getMarketPrice());
            return converter.apply(dao.save(car));
        } else {
            return null;
        }
    }

    public CarDtoSeller addCar(CarDtoSeller carDto) {
        Car car = dao.findById((carDto.getId()));

        if (car != null) {
            throw new AddCarConflitException(car.getId());
        } else {
            Car newCar = new Car(
                    carDto.getBrand(),
                    carDto.getOriginalPrice(),
                    carDto.getMarketPrice(),
                    carDto.getVin(),
                    carDto.getYear()
            );
            Car car2 = dao.save(newCar);
            return sellerConverter.apply(car2);
        }
    }
}
