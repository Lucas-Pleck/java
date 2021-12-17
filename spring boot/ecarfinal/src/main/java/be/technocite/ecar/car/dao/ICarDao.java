package be.technocite.ecar.car.dao;

import be.technocite.ecar.car.model.Car;

import java.util.List;

//c'est ici que vous créez les signatures de méthodes
// pour accéder à la couche persistence avec la base de données
public interface ICarDao {

    Car findById(int id);

    List<Car> findAll();

    Car save(Car save);

    boolean delete(int id);
}
