package com.techwithtony.sample.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techwithtony.sample.firstapp.model.PropertyReader;

@RestController
public class ProperReaderController {

	@Autowired
	private Environment env;
	
	
	@Autowired
	private PropertyReader  propReader;
	
	
	@Value("${app.author}")
	private  String author;

	@GetMapping("/mypath/propvalues")
	public String sample(@RequestParam(name = "argument1") String key) throws Exception {  // using app.name key from application.properties file

		

		return env.getProperty(key) + " Prop from @Value   Author=" +author  +"  Property App Type from @ConfigurationProperties  = " +propReader.getType();  }

}
