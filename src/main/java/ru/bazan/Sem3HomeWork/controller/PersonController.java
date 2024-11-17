package ru.bazan.Sem3HomeWork.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.bazan.Sem3HomeWork.model.Person;

import java.util.ArrayList;

@RestController
@RequestMapping(path="/JSON", produces="application/json")
@CrossOrigin(origins="*")
public class PersonController {

    @GetMapping("/data")
    public ArrayList<Person> get(){

        ArrayList<Person> arr = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("Mike");
        person1.setAge(28);

        Person person2 = new Person();
        person2.setName("Nicola");
        person2.setAge(29);

        arr.add(person1);
        arr.add(person2);

        return arr;
    }
//    @GetMapping("/{age}/{name}/")
//    public ResponseEntity<Person> getData(@PathVariable("age") int age,
//                                          @PathVariable("name") String name) {
//
//        Person person = new Person();
//        person.setAge(age);
//        person.setName(name);
//
//        HttpHeaders headers = new HttpHeaders();
//
//        ResponseEntity<Person> entity = new ResponseEntity<>(person,headers, HttpStatus.CREATED);
//
//        return entity;
//    }



}
