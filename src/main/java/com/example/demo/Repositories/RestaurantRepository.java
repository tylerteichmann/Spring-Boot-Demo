package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.Models.Restaurant;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

    @Query("{borough:'?0'}")
    public List<Restaurant> findRestaurantByBorough(String borough);

}
