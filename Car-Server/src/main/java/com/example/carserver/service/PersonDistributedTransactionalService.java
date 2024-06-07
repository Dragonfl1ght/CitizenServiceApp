package com.example.carserver.service;

import com.example.carserver.model.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonDistributedTransactionalService {
    private final CarService service;
    private final KafkaTemplate kafkaTemplate;
    public void carCreateOrRollback(Car car){
        try {
            service.create(car);
            throw new RuntimeException();
        } catch (Exception e) {
            kafkaTemplate.send("rollback_event", car.getOwnerId());
        }
    }
}
