package com.naveen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/diseases")
	public String doctors() {
		return "list of diseases";
	}
}
