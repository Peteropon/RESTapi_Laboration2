package com.iths.app;

import com.iths.model.Animal;
import com.iths.model.AnimalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(AnimalRepository repo){
        if(repo.count() == 0) {
            return args -> {
                log.info("Preloading " + repo.save(new Animal("Elephant", "Grey")));
                log.info("Preloading " + repo.save(new Animal("Elk", "Brown")));
            };
        } else return null;
    }

}
