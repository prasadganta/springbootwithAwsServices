package com.techwithtony.sample.firstapp.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techwithtony.sample.firstapp.model.StringResponse;

@RestController
@Validated
public class RequestParamAndPathVariables {

	@GetMapping("/mypath/myendpoint")
	public ResponseEntity<StringResponse> sample(
			@RequestParam(name = "argument1") @NotEmpty @Size(min = 10, max = 200, message = "About Me must be between 10 and 200 characters") String argument1,
			@RequestParam(name = "age") @Min(value = 18, message = "Age should not be less than 18") @Max(value = 150, message = "Age should not be greater than 150") int age,
			@RequestParam(value = "argument3") @NotBlank String argument3) throws Exception {
		StringResponse responseStr = new StringResponse();
		String resStr = "Hi from first app with Get Http method!!! along with RequestParams" + "argument1=" + argument1
				+ ", argument2=" + argument3;
		responseStr.setResponse(resStr);
		return new ResponseEntity<StringResponse>(responseStr, HttpStatus.OK);
	}

	@GetMapping("/mypath/myendpoint/{pathvar1}")
	public String sample2(@PathVariable(value = "pathvar1") String pathvar1,
			@RequestParam(value = "argument1") String argument1, @RequestParam(value = "argument2") String argument2) {

		return "Hi from first app with Get Http method!!! along with RequestParams" + "argument1=" + argument1
				+ ", argument2=" + argument2 + "And with one pathParams " + pathvar1;
	}

}
