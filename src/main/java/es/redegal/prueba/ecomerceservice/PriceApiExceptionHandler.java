package es.redegal.prueba.ecomerceservice;

import es.redegal.prueba.ecomerceservice.service.exception.ProductPriceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class PriceApiExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = ProductPriceNotFoundException.class)
    public ResponseEntity<Object> notFoundException() {
        return new ResponseEntity<>("Product price not found", HttpStatus.NOT_FOUND);
    }

}
