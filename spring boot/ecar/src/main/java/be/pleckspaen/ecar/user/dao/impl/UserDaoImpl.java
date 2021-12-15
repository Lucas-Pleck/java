package be.pleckspaen.ecar.user.dao.impl;

import be.pleckspaen.ecar.user.dao.IUserDao;
import be.pleckspaen.ecar.user.modele.User;
import be.pleckspaen.ecar.user.modele.UserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    private List<User> users = new ArrayList<>();

    @PostConstruct
    private void onPostConstruct() {
        users.add(new User(
                "Jean",
                UserType.BUYER
        ));
        users.add(new User(
                "Fabrice",
                UserType.BUYER
        ));
        users.add(new User(
                "Georges",
                UserType.SELLER
        ));

        users.add(new User(
                "Rudolf",
                UserType.SELLER
        ));


    }

    @Override
    public User findById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User save(User user) {
        int userIndex = users.indexOf(user);
        if (userIndex == -1) {
            users.add(user);
            logger.debug("User " + user.getId() + " created");
            return users.get(users.size() - 1);
        } else {
            logger.debug("User " + user.getId() + " updated");
            return users.set(userIndex, user);
        }
    }

    @Override
    public boolean delete(int id) {
        User userPersisted = findById(id);
        if (userPersisted != null) {
            logger.debug("User " + userPersisted.getId() + " deleted");
            return users.remove(userPersisted);
        }
        return false;
    }

    @Override
    public int count() {
        return users.size();
    }
}
