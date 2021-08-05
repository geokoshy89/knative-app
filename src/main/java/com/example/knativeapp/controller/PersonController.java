package com.example.knativeapp.controller;

import java.util.Optional;
import java.util.Set;

import com.example.knativeapp.entity.Person;
import com.example.knativeapp.repository.PersonRepository;
import com.example.knativeapp.service.PersonService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

   private PersonRepository repository;
   private PersonService service;

   PersonController(PersonRepository repository, PersonService service) {
      this.repository = repository;
      this.service = service;
   }

   @PostMapping
   public Person add(@RequestBody Person person) {
      return repository.save(person);
   }

   @PutMapping
   public Person update(@RequestBody Person person) {
      return repository.save(person);
   }

   @DeleteMapping("/{id}")
   public void delete(@PathVariable("id") String id) {
      repository.deleteById(id);
   }

   @GetMapping
   public Iterable<Person> findAll() {
      return repository.findAll();
   }

   @GetMapping("/{id}")
   public Optional<Person> findById(@PathVariable("id") String id) {
      return repository.findById(id);
   }

   @GetMapping("/first-name/{firstName}/last-name/{lastName}")
   public Set<Person> findByFirstNameAndLastName(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
      return repository.findByFirstNameAndLastName(firstName, lastName);
   }

   @GetMapping("/age-greater-than/{age}")
   public Set<Person> findByAgeGreaterThan(@PathVariable("age") int age) {
      return repository.findByAgeGreaterThan(age);
   }

   @GetMapping("/age/{age}")
   public Set<Person> findByAge(@PathVariable("age") int age) {
      return repository.findByAge(age);
   }

}