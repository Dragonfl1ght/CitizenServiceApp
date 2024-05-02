package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.model.Car;
import com.kuralesov.citizenservice.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
class CarServiceImplTest {
    @Autowired
    private CarServiceImpl carService;
    @Mock
    private CarRepository carRepository;

    @Test
    void create() {
    }

    @Test
    void getById() {
        //given
        Car car = new Car(1L, "Tesla", 1000, null);
        when(carRepository.findById(anyLong())).thenReturn(Optional.of(car));
        //when
        Car res = carService.getById(1L);
        assertEquals(car, res);
        //then

    }

    @Test
    void getAll() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void edit() {
    }
}