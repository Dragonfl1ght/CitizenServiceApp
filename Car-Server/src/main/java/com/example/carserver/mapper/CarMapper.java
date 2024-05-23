package com.example.carserver.mapper;

import com.example.carserver.dto.CarDto;
import com.example.carserver.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    Car map(CarDto carDto);
    CarDto map(Car car);
    List<CarDto> map(List<Car> listCar);
}
