package com.techwithtony.sample.firstapp.exceptionHandler;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.techwithtony.sample.firstapp.model.ErrorResponse;

@ControllerAdvice
public class ExceptionInterceptor extends ResponseEntityExceptionHandler {

	 
	  @ExceptionHandler(ConstraintViolationException.class)
	  public final ResponseEntity<ErrorResponse> handleConstraintViolation(ConstraintViolationException ex,
	                        WebRequest request) {
	    List<String> details = new ArrayList<>();
	    details.add(ex.getLocalizedMessage());
	    ErrorResponse error = new ErrorResponse(String.format("Invalid input parameters: %s\n"), details);
	    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	  }
}
