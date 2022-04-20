package com.naveen;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	
	@Value("${my.greeting: default value}")
	private String greetingMessage;
	
	@Value("Static message")
	private String staticMessage;
	
	@Value("${my.list.values}")
	private List<String> listValues;
	
	@Autowired
	private DBSettings dbSettings;
	
	@Autowired
	private Environment env;
	
	
	
	@GetMapping("/greeting")
	public String greeting() {
		return dbSettings.getConnection() + dbSettings.getHost();
	}
	
	@GetMapping("/envdetails")
	public String envDetails() {
		return env.toString();
	}
}
