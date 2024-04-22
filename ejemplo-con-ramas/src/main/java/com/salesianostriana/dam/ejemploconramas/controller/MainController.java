package com.salesianostriana.dam.ejemploconramas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String sayHello() {
		return "index";
	}
	
	@GetMapping("/r")
	public String sayHello1() {
		return "index";
	}

}
