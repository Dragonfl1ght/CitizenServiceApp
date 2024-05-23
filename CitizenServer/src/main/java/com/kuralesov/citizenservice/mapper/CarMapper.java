package com.kuralesov .citizenservice.mapper;

import com.kuralesov.citizenservice.dto.CarDto;
import com.kuralesov.citizenservice.dto.CarEditRequest;
import com.kuralesov.citizenservice.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    Car map(CarEditRequest editRequest);
    Car map(CarDto carDto);
    CarDto map(Car car);
    List<CarDto> map(List<Car> listCar);
}
