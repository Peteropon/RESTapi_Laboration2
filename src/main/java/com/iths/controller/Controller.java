package com.iths.controller;

import lombok.extern.slf4j.Slf4j;
import com.iths.app.AnimalNotFoundException;
import com.iths.model.Animal;
import com.iths.model.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@RequestMapping
public class Controller {

    @Autowired
    public Controller(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    private AnimalRepository animalRepository;

    //Aggregate methods

    @RequestMapping(method = RequestMethod.GET)
    List<Animal> getAll(){
        return animalRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    Animal createAnimal(@RequestBody Animal animal){
        animalRepository.save(animal);
        return animal;
    }

    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    void deleteAll(){
        animalRepository.deleteAll();
    }


    //Single-item methods

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    Animal getOne(@PathVariable String name){
        return animalRepository.findByName(name);
    }

    @PutMapping("/{id}")
    Animal changeOne(@RequestBody Animal newAnimal, @PathVariable String id){
        return animalRepository.findById(String.valueOf(id)).map(animal -> {
            animal.setName(newAnimal.getName());
            animal.setColor(newAnimal.getColor());
            return animalRepository.save(newAnimal);
        }).orElseThrow( () -> new AnimalNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    void deleteAnimal(@PathVariable String id){
        animalRepository.deleteById(id);
    }



}
