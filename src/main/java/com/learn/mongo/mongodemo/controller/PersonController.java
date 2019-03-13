package com.learn.mongo.mongodemo.controller;

import com.learn.mongo.mongodemo.entities.Person;
import com.learn.mongo.mongodemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/")
    public List<Person> index(){
        return personRepository.findAll();
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

    @GetMapping ("/Person")
    public List<Person> getAll() {
        return personRepository.findAll();
    }


}
