package com.kuralesov.citizenservice.client;

import com.kuralesov.citizenservice.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "car-server")
public interface CarClient {

    @PostMapping("/car/create")
    public Car create(@RequestBody Car car);
}
