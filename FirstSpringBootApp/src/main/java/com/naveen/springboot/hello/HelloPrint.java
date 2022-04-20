package com.naveen.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPrint {

	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}
}
