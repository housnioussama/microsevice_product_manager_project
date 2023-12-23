package com.microservice.productservice.exceptionmanager.exceptinhandler;

import com.microservice.productservice.exceptionmanager.ProductException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(ProductException.class)
    public ResponseEntity<String> handleNullProductException(ProductException ex){
        return new ResponseEntity<>("Product Error ", HttpStatus.BAD_REQUEST);
    }
}
