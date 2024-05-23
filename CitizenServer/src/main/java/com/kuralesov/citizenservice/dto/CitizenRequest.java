package com.kuralesov.citizenservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class CitizenRequest{
    private Long id;
    private String name;
    private String surname;
    private int age;
    private List<CarDto> carList;
}

