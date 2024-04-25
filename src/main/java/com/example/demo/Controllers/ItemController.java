package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Item;
import com.example.demo.Services.ItemService;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    
    @Autowired
    ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> list = itemService.GetAllItems();

        if (list == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }

    @PostMapping(produces = "application/json")
    public void addItem(@RequestBody Item item) {
        itemService.AddItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItemById(@PathVariable(value = "id") String id){
        itemService.DeleteItemById(id);
    }

}
