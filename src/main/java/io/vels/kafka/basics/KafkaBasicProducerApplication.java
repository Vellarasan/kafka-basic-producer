package io.vels.kafka.basics;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.security.SecureRandom;
import java.util.function.Supplier;

@SpringBootApplication
@Slf4j
public class KafkaBasicProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaBasicProducerApplication.class, args);
    }

    @Bean
    public Supplier<Integer> numberProducer() {
        return () -> new SecureRandom().nextInt(1, 100);
    }

}
