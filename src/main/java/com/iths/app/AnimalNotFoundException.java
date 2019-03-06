package com.iths.app;

public class AnimalNotFoundException extends RuntimeException {

    public AnimalNotFoundException(String id) {
        super("Could not find any animal with id " + id);
    }

}
