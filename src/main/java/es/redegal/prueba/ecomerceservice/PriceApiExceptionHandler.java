package es.redegal.prueba.ecomerceservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class PriceApiExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<Object> notFoundException() {
        return new ResponseEntity<>("Product price not found", HttpStatus.NOT_FOUND);
    }

}
