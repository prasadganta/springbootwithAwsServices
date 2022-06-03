package com.techwithtony.sample.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/hi")
	public String sayHi() {
		
		return "Hi from first app!!!";
	}

}
