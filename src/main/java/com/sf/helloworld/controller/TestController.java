package com.sf.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
//	http://localhost:8080/success123
	@GetMapping("/success123")
	public String test111() {
		
		return "success";
		
	}
	
	

}
