package com.example.demo.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Models.Item;

public interface ItemRepository extends MongoRepository<Item, String> {

}
