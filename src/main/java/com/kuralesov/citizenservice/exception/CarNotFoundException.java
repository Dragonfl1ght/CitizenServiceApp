package com.kuralesov.citizenservice.exception;

public class CarNotFoundException extends RuntimeException{
    private static String errorMessage = "Не найдена машина с id: ";
    public CarNotFoundException(Long id){
        super(errorMessage + id);
    }
}
