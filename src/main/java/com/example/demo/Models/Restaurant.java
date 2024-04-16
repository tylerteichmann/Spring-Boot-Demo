package com.example.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("restaurants")
public class Restaurant {
    public String borough;
    public String cuisine;
    public String name;
    @Id
    public String id;

    public Restaurant(String borough, String cuisine, String name, String restaurant_id) {
        this.borough = borough;
        this.cuisine = cuisine;
        this.name = name;
        this.id = restaurant_id;
    }
}
