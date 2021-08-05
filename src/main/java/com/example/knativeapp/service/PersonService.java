package com.example.knativeapp.service;

import java.util.HashSet;
import java.util.Set;

import com.example.knativeapp.entity.Person;
import com.example.knativeapp.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

	@Autowired
	PersonRepository repository;
	@Autowired
	ApplicationEventPublisher applicationEventPublisher;

	@Transactional
	public Set<Person> doIt(Person... persons) {
		Set<Person> personSet = new HashSet<>();
		for (Person p: persons) {
			personSet.add(repository.save(p));
		}
//		applicationEventPublisher.publishEvent(new PersonAddEvent());
		return personSet;
	}
}