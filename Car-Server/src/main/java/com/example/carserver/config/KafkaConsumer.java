package com.example.carserver.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "Kafka", groupId = "my_consumer")
    public void listen(String message){
        System.out.println("Recieved message = " + message);
    }
}
