package com.techwithtony.sample.firstapp.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Person {
	
	
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
