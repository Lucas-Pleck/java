package be.technocite.ecar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarDoesNotExistException extends RuntimeException {

    public int id;

    public CarDoesNotExistException(int id) {
        this.id = id;
    }
}
