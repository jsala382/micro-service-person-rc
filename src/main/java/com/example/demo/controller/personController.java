package com.example.demo.controller;


import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path= "api/v1/persons")
public class personController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAll() {
        return personService.getPerson();
    }
    @GetMapping("/{personId}")
    public Optional<Person> getById(@PathVariable ("personId") Integer personId) {
        return personService.getPerson(personId);
    }


    @PostMapping
    public void saveUpdate(@RequestBody Person person) {
        personService.saveOrUpdatePerson(person);
    }


    @DeleteMapping("/{personId}")
    public void saveUpdate(@PathVariable("personId") Integer personId) {
        personService.deletePerson(personId);
    }
}

