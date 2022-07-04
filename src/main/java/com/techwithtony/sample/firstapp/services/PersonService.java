package com.techwithtony.sample.firstapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.techwithtony.sample.firstapp.model.Person;
import com.techwithtony.sample.firstapp.repo.PersonRepo;

@Service
@Component
public class PersonService {
	
	@Autowired
	PersonRepo repo;
	
	public String personProcess(Person person) {
		
		repo.save(person);
		return "Added Person";
		
	}

}
