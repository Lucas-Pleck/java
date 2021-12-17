package be.technocite.ecar.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler
    public ResponseEntity<Object> handle(CarConflictException e) {
        String message = messageSource.getMessage(
                "error.conflict.id",
                new Object[]{e.id},
                LocaleContextHolder.getLocale());
        return new ResponseEntity<>(message, HttpStatus.CONFLICT);
    }

    @ExceptionHandler
    public ResponseEntity<Object> handle(UserDoesNotExistException e) {
        Map<String, String> errors = new HashMap<>();
        errors.put("message", "l'user " + e.id + " n'existe pas");
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errors);
    }

    @ExceptionHandler
    public ResponseEntity<Object> handle(CarDoesNotExistException e) {
        Map<String, String> errors = new HashMap<>();
        errors.put("message", "la voiture " + e.id + " n'existe pas");
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errors);
    }
}
