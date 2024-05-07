package com.kuralesov.citizenservice.client;

import com.kuralesov.citizenservice.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "carclient", path = "http://localhost:8081/car")
public interface CarClient {

    @PostMapping("/create")
    public Car create(@RequestBody Car car);
}
