package com.example.carserver.exceptions;

public class CarNotFoundException extends RuntimeException{
    private static String errorMessage = "Не найдена машина с id: ";
    public CarNotFoundException(Long id){
        super(errorMessage + id);
    }
}
