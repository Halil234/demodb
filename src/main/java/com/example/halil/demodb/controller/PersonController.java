package com.example.halil.demodb.controller;

import com.example.halil.demodb.entity.Person;
import com.example.halil.demodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/person",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> getPerson() {

        return personRepository.findAll();


    }
}
