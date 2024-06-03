package com.example.carserver.mapper;

import com.example.carserver.dto.CarDto;
import com.example.carserver.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    @Mapping(target = "ownerId", source = "ownerId")
    Car map(CarDto carDto);
    CarDto map(Car car);
    List<CarDto> map(List<Car> listCar);
}
