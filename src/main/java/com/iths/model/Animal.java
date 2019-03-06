package com.iths.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "animal")
public class Animal {

    @Id
    @Field("_id")
    private ObjectId _id;

    @Field("name")
    private String name;

    @Field("color")
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

}
