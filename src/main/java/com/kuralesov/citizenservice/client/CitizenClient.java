package com.kuralesov.citizenservice.client;

import com.kuralesov.citizenservice.controller.CitizenController;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "citizenClient", url = "http://localhost:8080/car")
public interface CitizenClient extends CitizenController {
}
