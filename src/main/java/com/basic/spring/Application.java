package com.basic.spring;

import com.basic.spring.model.Item;
import com.basic.spring.model.Master;
import com.basic.spring.repo.ItemRepository;
import com.basic.spring.repo.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private MasterRepository masterRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		masterRepository.save(new Master("1111","test1",2000,2,new BigDecimal(1.11)));
		masterRepository.save(new Master("2222","test2",2001,2,new BigDecimal(1.12)));
		masterRepository.save(new Master("3333","test3",2002,2,new BigDecimal(1.13)));
		masterRepository.save(new Master("4444","test4",2003,2,new BigDecimal(1.14)));
		masterRepository.save(new Master("5555","test5",2004,2,new BigDecimal(1.15)));

	}
}
