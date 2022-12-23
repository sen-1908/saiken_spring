package com.basic.spring.controller;


import com.basic.spring.model.Item;
import com.basic.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class mainController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public String index() {
        return "Hello";
    }

    @RequestMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping("/items")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }
    @PutMapping("/items/{itemId}")
    public void updateItem(@RequestBody Item item,@PathVariable("itemId") Long itemId) {
        itemService.updateItem(itemId,item);
    }

    @DeleteMapping("/items/{itemId}")
    public void deleteItem(@PathVariable("itemId") Long itemId) {
        itemService.deleteItem(itemId);
    }
}
