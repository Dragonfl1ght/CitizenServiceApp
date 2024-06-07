package com.kuralesov.citizenservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.serialization.LongSerializer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration
public class KafkaProducerConfig {
    @Bean
    @Primary
    public KafkaTemplate<?, ?> kafkaTemplate(KafkaProperties kafkaProperties, ObjectMapper objectMapper) {
        JsonSerializer<?> jsonSerializer = new JsonSerializer<>(objectMapper);
        DefaultKafkaProducerFactory<?, ?> defaultKafkaProducerFactory = new DefaultKafkaProducerFactory<>(kafkaProperties.buildProducerProperties(null),
                new LongSerializer(), jsonSerializer
        );
        KafkaTemplate<?, ?> template = new KafkaTemplate<>(defaultKafkaProducerFactory);
        template.setMessageConverter(new StringJsonMessageConverter());
        return template;
    }
    @Bean
    public NewTopic newTopic(){
        return new NewTopic("create_car", 1, (short)1);
    }
}
