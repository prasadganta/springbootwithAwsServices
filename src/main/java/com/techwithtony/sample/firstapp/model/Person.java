package com.techwithtony.sample.firstapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "Person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotEmpty
	@Size(min = 5, message = "firstName should have at least 5 characters")
	private String firstName;
	@NotEmpty
	@Size(min = 5,max=15, message = "lastName should have at least 5 characters")
	private String lastName;
	
	private String address;	
	
	@Email
	@NotEmpty
	private String email;

}
