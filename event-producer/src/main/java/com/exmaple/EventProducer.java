package com.exmaple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EventProducer {
    public static void main(String[] args) {
        SpringApplication.run(EventProducer.class);
    }
}
