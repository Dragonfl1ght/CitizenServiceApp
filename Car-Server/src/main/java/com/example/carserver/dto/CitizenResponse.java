package com.example.carserver.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CitizenResponse {

    private Long id;
   // private Passport passport;
    private String name;
    private String surname;
    private int age;
    private List<CarDto> carList;
}
