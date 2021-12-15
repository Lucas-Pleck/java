package be.pleckspaen.ecar.user.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AddUserConflitException extends RuntimeException {

    public int id;

    public AddUserConflitException(int id) {
        this.id = id;
    }
}
