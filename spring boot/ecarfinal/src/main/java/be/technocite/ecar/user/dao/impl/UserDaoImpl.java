package be.technocite.ecar.user.dao.impl;

import be.technocite.ecar.user.dao.IUserDao;
import be.technocite.ecar.user.model.User;
import be.technocite.ecar.user.model.UserType;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {
    private List<User> users = new ArrayList<>();

    @PostConstruct
    private void onPostConstruct() {
       users.add(new User(
            "George",
               new ArrayList<>(),
               UserType.BUYER
       ));
       users.add(new User(
            "Jeanne",
               new ArrayList<>(),
               UserType.RETAILER
       ));
    }

    @Override
    public User findById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User save(User user) { // utilisé à la fois pourla création et la mise à jour
        int userIndex = users.indexOf(user);

        if (userIndex != -1) {
            // mise à jour
            users.set(userIndex, user);
            return users.get(userIndex);
        } else {
            return null;
        }
    }

}
