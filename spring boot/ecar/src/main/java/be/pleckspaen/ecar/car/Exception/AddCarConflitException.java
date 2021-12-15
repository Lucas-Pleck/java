package be.pleckspaen.ecar.car.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AddCarConflitException extends RuntimeException {

    public int id;

    public AddCarConflitException(int id) {
        this.id = id;
    }
}
