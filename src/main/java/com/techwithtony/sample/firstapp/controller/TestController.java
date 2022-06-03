package com.techwithtony.sample.firstapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/hi")
	public String sayHi() {
		
		return "Hi from first app with Get Http method!!!";
	}
	
	@PostMapping("/hi")
	public String postMapping() {
		
		return "Hi from first app  with post Http method!!!!";
	}
	
	@PutMapping("/hi")
	public String putMapping() {
		
		return "Hi from first app   with put  Http method!!!";
	}
	
	@DeleteMapping("/hi")
	public String deleteMapping() {
		
		return "Hi from first app  with delete Http method!!!";
	}
	
	

}
