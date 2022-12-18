package com.basic.spring.controller;


import com.basic.spring.model.Item;
import com.basic.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
