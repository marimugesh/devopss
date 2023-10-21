package com.devopss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopssController {
	@GetMapping(path="/get")
	public String getData() {
		return "Hello World...";
	}

}
