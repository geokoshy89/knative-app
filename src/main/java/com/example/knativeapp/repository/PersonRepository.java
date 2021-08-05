package com.example.knativeapp.repository;

import java.util.Set;

import com.example.knativeapp.entity.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
   Set<Person> findByFirstNameAndLastName(String firstName, String lastName);
   Set<Person> findByAge(int age);
   Set<Person> findByAgeGreaterThan(int age);
}