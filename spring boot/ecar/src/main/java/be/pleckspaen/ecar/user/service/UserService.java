package be.pleckspaen.ecar.user.service;

import be.pleckspaen.ecar.carapi.dto.CarDtoBuyer;
import be.pleckspaen.ecar.carapi.dto.CarDtoSeller;
import be.pleckspaen.ecar.user.Exception.AddUserConflitException;
import be.pleckspaen.ecar.user.converter.UserConverterBuyer;
import be.pleckspaen.ecar.user.converter.UserConverterSeller;
import be.pleckspaen.ecar.user.dao.IUserDao;
import be.pleckspaen.ecar.user.modele.User;
import be.pleckspaen.ecar.userapi.dto.UserDtoBuyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private IUserDao dao;

    @Autowired
    private UserConverterBuyer converter;
    @Autowired
    private UserConverterSeller sellerConverter;


    //une méthode qui prend en parametre rien
    //  qui renvoit une liste de tous les utilisateurs et de leur liste de favoris


    public UserDtoBuyer getUserById(int id) {
        return .apply(dao.findById(id));
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public CarDtoBuyer updateCar(CarDtoBuyer carDto) {
        User car = dao.findById(carDto.getId());
        if (car != null) {
            car.setMarketPrice(carDto.getMarketPrice());
            return converter.apply(dao.save(car));
        } else {
            return null;
        }
    }

    public CarDtoSeller addCar(CarDtoSeller carDto) {
        User car = dao.findById((carDto.getId()));

        if (car != null) {
            throw new AddUserConflitException(car.getId());
        } else {
            User newCar = new User(
                    carDto.getBrand(),
                    carDto.getOriginalPrice(),
                    carDto.getMarketPrice(),
                    carDto.getVin(),
                    carDto.getYear()
            );
            User car2 = dao.save(newCar);
            return sellerConverter.apply(car2);
        }
    }
}
