package com.techwithtony.sample.firstapp.controller;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class RequestParamAndPathVariables {
	
	@GetMapping("/mypath/myendpoint")
	public String sample(@RequestParam(value="argument1") @NotNull String argument1,@RequestParam(value="argument2") String argument2) {
		
		return "Hi from first app with Get Http method!!! along with RequestParams" +"argument1="+argument1 +", argument2="+argument2;
	}
	

	
	@GetMapping("/mypath/myendpoint/{pathvar1}")
	public String sample2(@PathVariable(value="pathvar1") String pathvar1,@RequestParam(value="argument1") String argument1,@RequestParam(value="argument2") String argument2) {
		
		return "Hi from first app with Get Http method!!! along with RequestParams" +"argument1="+argument1 +", argument2="+argument2 +"And with one pathParams "+ pathvar1;
	}
	
}
