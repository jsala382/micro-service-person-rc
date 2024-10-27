package com.example.demo.service;


import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    public Optional<Person> getPerson(Integer id){
            return personRepository.findById(id);
    }

    public void saveOrUpdatePerson(Person person){
        personRepository.save(person);
    }

    public void deletePerson(Integer id){
        personRepository.deleteById(id);
    }

}
