package com.learn.mongo.mongodemo.repository;

import com.learn.mongo.mongodemo.entities.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;


public interface PersonRepository  extends MongoRepository <Person, UUID>{


}
