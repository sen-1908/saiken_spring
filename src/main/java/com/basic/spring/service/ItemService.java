package com.basic.spring.service;

import com.basic.spring.model.Item;
import com.basic.spring.model.Master;
import com.basic.spring.repo.ItemRepository;
import com.basic.spring.repo.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private MasterRepository masterRepository;

    public List<Item> getAllItems() {
        List<Item>allItems = new ArrayList<>();
        itemRepository.findAll().forEach(allItems::add);
        return allItems;
    }
    public Item getItem(Long brandId) {
        Item item = itemRepository.findById(brandId).get();
        return item;
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

    public List<Master> getMasterData() {
        List<Master>masterData = new ArrayList<>();
        masterRepository.findAll().forEach(masterData::add);
        return masterData;
    }
}
