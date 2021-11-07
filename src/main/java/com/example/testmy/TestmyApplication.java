package com.example.testmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableScheduling
public class TestmyApplication {

    public static void main(String[] args) {


        SpringApplication.run(TestmyApplication.class, args);
    }



}
