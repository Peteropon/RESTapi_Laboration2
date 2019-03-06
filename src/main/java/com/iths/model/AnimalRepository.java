package com.iths.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface AnimalRepository extends MongoRepository<Animal, String> {

    List<Animal> findAnimalByName(@Param("name") String name);

    Animal findByName(@Param("name") String name);

    Animal findBy_id(ObjectId id);

}
