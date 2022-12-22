package com.basic.spring;

import com.basic.spring.model.Item;
import com.basic.spring.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	private ItemRepository itemRepository;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
