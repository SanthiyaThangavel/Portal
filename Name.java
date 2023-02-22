package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Name {
	private String studentName="MyName";
	    @GetMapping("/")
	public String getName(){
	    return "Welcome "+studentName;
	    }
}
