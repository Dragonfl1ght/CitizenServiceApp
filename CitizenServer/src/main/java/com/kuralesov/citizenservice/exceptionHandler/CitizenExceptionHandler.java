package com.kuralesov .citizenservice.exceptionHandler;

import com.kuralesov.citizenservice.exception.CitizenNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CitizenExceptionHandler {
    @ExceptionHandler({CitizenNotFoundException.class})
    public ResponseEntity<String> citizenNotFoundHandler(CitizenNotFoundException error){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error.getMessage());
    }
}
