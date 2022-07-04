package com.techwithtony.sample.firstapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techwithtony.sample.firstapp.model.Person;

public interface PersonRepo  extends JpaRepository<Person, Long>{

}
