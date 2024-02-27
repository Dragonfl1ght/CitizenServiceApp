package com.kuralesov.citizenservice.exception;

public class CitizenNotFoundException extends RuntimeException{
    private static String errorMessage = "Не найден житель с id:";
    public CitizenNotFoundException(Long id){
        super(errorMessage + id);
    }

}
