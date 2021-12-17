package be.technocite.ecar.car.dao.impl;

import be.technocite.ecar.car.dao.ICarDao;
import be.technocite.ecar.car.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// classe qui définit les méthodes d'accès à la persistence des données,
// cette classe exemple immite une base de donnée qui est remplacée par une List
@Repository
public class CarDaoImpl implements ICarDao {

    // ce sera toujours le .class de la classe où on appelle le logger
    Logger logger = LoggerFactory.getLogger(CarDaoImpl.class);

    private List<Car> cars = new ArrayList<>();

    @PostConstruct
    private void onPostConstruct() {
        cars.add(new Car(
                "MERCEDES",
                14999.99,
                10000.00,
                "AB9",
                new Date()
        ));
        cars.add(new Car(
                "BMW",
                19999.99,
                15000.00,
                "AC9",
                new Date()
        ));
    }

    @Override
    public Car findById(int id) {
        return cars.stream()
                .filter(car -> car.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public Car save(Car car) { // utilisé à la fois pourla création et la mise à jour
        int carIndex = cars.indexOf(car);

        // ajout
        if (carIndex == -1) {
            cars.add(car);
            logger.debug("Car " + car.getId() + " created");
            return cars.get(cars.size() - 1);
        } else {
            // mise à jour
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
}
