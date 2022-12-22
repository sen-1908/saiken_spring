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
    private List<Item>allItems = new ArrayList<>();
    public List<Item> getAllItems() {

        itemRepository.findAll().forEach(allItems::add);
        return allItems;
    }


    public List<Item> addItem(Item item) {
        allItems.add(item);
        return allItems;
    }
}
