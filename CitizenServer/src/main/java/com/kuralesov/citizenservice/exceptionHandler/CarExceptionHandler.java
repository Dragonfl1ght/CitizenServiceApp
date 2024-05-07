package com.kuralesov .citizenservice.exceptionHandler;

import com.kuralesov.citizenservice.exception.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CarExceptionHandler {
    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<String> carNotFoundHandler(CarNotFoundException error){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error.getMessage());
    }
}
