package be.technocite.ecar.car.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//RuntimeException permet d'éviter de mettre un throws dans la signature de la méthode
// et par conséquent de devoir gérer l'exception plus haut avec un try catch
@ResponseStatus(HttpStatus.CONFLICT)
public class CarConflictException extends RuntimeException {

    public int id;

    public CarConflictException(int id) {
        this.id = id;
    }
}
