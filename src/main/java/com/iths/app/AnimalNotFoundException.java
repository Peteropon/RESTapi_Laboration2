package com.iths.app;

import org.bson.types.ObjectId;

public class AnimalNotFoundException extends RuntimeException {

    public AnimalNotFoundException(ObjectId id) {
        super("Could not find any animal with id " + id);
    }

}
