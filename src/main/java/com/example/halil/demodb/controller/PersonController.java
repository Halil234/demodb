package com.example.halil.demodb.controller;

import com.example.halil.demodb.entity.Person;
import com.example.halil.demodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/person",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> getPerson() {

        return personRepository.findAll();


    }
    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/personOne/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Optional<Person> getPersonOne(@PathVariable int id) {


        return personRepository.findById(id);


    }


    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/personSave",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public void savePersonOne(@RequestBody Map<String,String> body) {
        System.out.println("Debug 1 this is the post " + body );

        Person person = new Person();
        person.setId(body.get("id"));
        person.setName(body.get("name"));

        List<Person> personList = new ArrayList<Person>(Arrays.asList(person));

        personRepository.saveAll(personList);
    }

}
