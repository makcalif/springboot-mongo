package com.learn.mongo.mongodemo.controller;

import com.learn.mongo.mongodemo.entities.Person;
import com.learn.mongo.mongodemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController (value = "persons")
public class PersonController {


//    @GetMapping("/persons")
//    public List<Person> getAll() {
//        Person p = new Person(UUID.randomUUID(), "mumtaz", "khan");
//        List<Person> pp = new ArrayList<>();
//        pp.add(p);
//        return pp;
//    }


    @Autowired
    PersonRepository personRepository;

    @GetMapping
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    @PostMapping
    public Person add(@RequestBody Person person)  {
       return personRepository.save(person);
    }

//    @GetMapping     ("/Person/name/{firstname}/{lastname}")
//    public Person getSenatorByFirstAndLastName(@PathVariable  String firstname, @PathVariable String lastname) {
//        List<Person> Person = personRepository.findByPersonFirstnameAndPersonLastname(firstname, lastname);
//        return Person.get(0);
//    }

    @GetMapping("/private")
    public String getPrivate() {
        return "private";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "start login here";
    }


}
