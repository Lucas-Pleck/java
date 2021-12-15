package be.pleckspaen.ecar.car.dao.impl;

import be.pleckspaen.ecar.car.dao.ICarDao;
import be.pleckspaen.ecar.car.modele.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class CarDaoImpl implements ICarDao {

    Logger logger = LoggerFactory.getLogger(CarDaoImpl.class);

    private List<Car> cars = new ArrayList<>();

    @PostConstruct
    private void onPostConstruct() {
        cars.add(new Car(
                "Mercedes",
                59990.90,
                19590.50,
                "nvnne5615",
                new Date()
        ));
        cars.add(new Car(
                "Dacia",
                990.90,
                90.50,
                "nvnd45615",
                new Date()
        ));

    }

    @Override
    public Car findById(int id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public Car save(Car car) {
        int carIndex = cars.indexOf(car);
        if (carIndex == -1) {
            cars.add(car);
            logger.debug("Car " + car.getId() + " created");
            return cars.get(cars.size() - 1);
        } else {
            logger.debug("Car " + car.getId() + " updated");
            return cars.set(carIndex, car);
        }
    }

    @Override
    public boolean delete(int id) {
        Car carPersisted = findById(id);
        if (carPersisted != null) {
            logger.debug("Car " + carPersisted.getId() + " deleted");
            return cars.remove(carPersisted);
        }
        return false;
    }

    @Override
    public int count() {
        return cars.size();
    }
}
