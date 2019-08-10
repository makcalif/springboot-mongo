package com.learn.mongo.mongodemo;

import com.learn.mongo.mongodemo.entities.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.UUID;

@SpringBootApplication
//@EnableDiscoveryClient

public class MongoDemoApplication implements CommandLineRunner {

//	@Autowired
//	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Person person = new Person(UUID.randomUUID(), "mumtaz", "khan");
//		personRepository.save(person);
//
//		personRepository.findAll()
//				.forEach(System.out::println);
	}
}
