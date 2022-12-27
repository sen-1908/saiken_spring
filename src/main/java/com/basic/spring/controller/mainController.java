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
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @RequestMapping("/{brandId}")
    public Item getItem(@PathVariable("brandId") Long brandId) {
        return itemService.getItem(brandId);
    }

    @PostMapping("/")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping("/{brandId}")
    public void updateItem(@RequestBody Item item,@PathVariable("brandId") Long brandId) {
        itemService.updateItem(brandId,item);
    }

    @DeleteMapping("/{brandId}")
    public void deleteItem(@PathVariable("brandId") Long brandId) {
        itemService.deleteItem(brandId);
    }
}
