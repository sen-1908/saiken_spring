package com.basic.spring.service;

import com.basic.spring.model.Item;
import com.basic.spring.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
    public List<Item> getAllItems() {
        List<Item>allItems = new ArrayList<>();
        itemRepository.findAll().forEach(allItems::add);
        return allItems;
    }


    public void addItem(Item item) {
        itemRepository.save(item);
    }

    public void updateItem(Long itemId, Item item) {
        if(itemRepository.findById(itemId).get() != null) {
            itemRepository.save(item);
        }
    }

    public void deleteItem(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}
