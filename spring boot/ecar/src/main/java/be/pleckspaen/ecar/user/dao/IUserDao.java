package be.pleckspaen.ecar.user.dao;

import be.pleckspaen.ecar.user.modele.User;

import java.util.List;

public interface IUserDao {

    User findById(int id);

    List<User> findAll();

    User save(User save);

    boolean delete(int id);

    int count();
}


