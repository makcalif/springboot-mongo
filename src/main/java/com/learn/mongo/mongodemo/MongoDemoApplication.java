package com.learn.mongo.mongodemo;

import com.learn.mongo.mongodemo.entities.Person;
import com.learn.mongo.mongodemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class MongoDemoApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Person person = new Person(UUID.randomUUID(), "mumtaz", "khan");
		personRepository.save(person);

		personRepository.findAll()
				.forEach(System.out::println);
	}
}
