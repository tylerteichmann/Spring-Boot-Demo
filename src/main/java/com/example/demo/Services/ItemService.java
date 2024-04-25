package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Item;
import com.example.demo.Repositories.ItemRepository;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void AddItem(Item item) {

        Optional<Item> existingItem = itemRepository.findById(item.id);

        if (existingItem.isPresent()){
            item.quantity += existingItem.get().quantity;
            itemRepository.save(item);
        } else {
            itemRepository.insert(item);
            itemRepository.save(item);
        }
    }

    public List<Item> GetAllItems() {
        return itemRepository.findAll();
    }

    public void DeleteItemById(String id) {
        itemRepository.deleteById(id);
    }

}
