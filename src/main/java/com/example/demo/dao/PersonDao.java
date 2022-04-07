package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {


    //methods for inserting a person into a database
    int insertPerson(UUID id, Person person);
    // Generate the user by itself
    default int insertPerson(Person person){
        //Generate a random id for the user
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);

    }

    List<Person> selectAllPeople();

    //search through the database
    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);



}
