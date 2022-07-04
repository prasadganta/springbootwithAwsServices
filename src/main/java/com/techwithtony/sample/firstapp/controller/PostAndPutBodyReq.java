package com.techwithtony.sample.firstapp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techwithtony.sample.firstapp.model.Person;
import com.techwithtony.sample.firstapp.services.PersonService;

@RestController
@Validated
public class PostAndPutBodyReq {
	
	@Autowired
	PersonService personService;
	
	@PostMapping(value="mypath/myendpoint/person",produces=MediaType.ALL_VALUE)
	@ResponseBody
	public ResponseEntity<String> personExample(@Valid @RequestBody Person person) {
		
		personService.personProcess(person);
        return ResponseEntity.ok("Person Created successfully !!!");
		
	}
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();

		ex.getBindingResult().getFieldErrors().forEach(error -> 
			errors.put(error.getField(), error.getDefaultMessage()));
		
		return errors;
	}
}
