package be.technocite.ecar.user.dao;

import be.technocite.ecar.car.model.Car;
import be.technocite.ecar.user.model.User;

import java.util.List;

public interface IUserDao {
    User findById(int id);

    List<User> findAll();

    User save(User save);
}
