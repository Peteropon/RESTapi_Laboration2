package com.iths.app;

import com.iths.model.Animal;
import com.iths.model.AnimalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Laboration2Application {

    public static void main(String[] args) {
        SpringApplication.run(Laboration2Application.class, args);
    }


}
