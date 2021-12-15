package be.pleckspaen.ecar.car.dao;

import be.pleckspaen.ecar.car.modele.Car;

import java.util.List;

public interface ICarDao {

    Car findById(int id);

    List<Car> findAll();

    Car save(Car save);

    boolean delete(int id);

    int count();
}


