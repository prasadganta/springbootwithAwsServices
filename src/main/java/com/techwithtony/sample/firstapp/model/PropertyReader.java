package com.techwithtony.sample.firstapp.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("app")
@Data
public class PropertyReader {
	
	private String name;
	private  String  type;
	private String author;

}
