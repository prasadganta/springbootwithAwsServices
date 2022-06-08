package com.techwithtony.sample.firstapp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techwithtony.sample.firstapp.model.Person;

@RestController
public class PostAndPutBodyReq {
	

	@PostMapping(value="mypath/myendpoint/person",produces=MediaType.ALL_VALUE)
	@ResponseBody
	public String personExample(@RequestBody Person person) {
		
		return  "Hey this is post method returning person details  Person Name="+person.getFirstName()+""+person.getLastName()+" From Address ="+person.getAddress();
		
	}
	
}
