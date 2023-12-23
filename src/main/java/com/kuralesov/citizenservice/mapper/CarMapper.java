package com.kuralesov.citizenservice.mapper;

import com.kuralesov.citizenservice.dto.CarEditRequest;
import com.kuralesov.citizenservice.dto.CarResponse;
import com.kuralesov.citizenservice.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    Car map(CarEditRequest editRequest);
    CarResponse map(Car car);
    List<CarResponse> map(List<Car> listCar);
}
