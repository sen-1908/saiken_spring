package com.basic.spring;

import com.basic.spring.model.Item;
import com.basic.spring.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ItemRepository itemRepository;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args)throws Exception {
		itemRepository.save(new Item("test","test"));
		itemRepository.save(new Item("test2","test3"));
	}
}
