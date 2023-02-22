package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	 @Value("${check.name}")
	    private String Name;
	    @GetMapping("/")
	    public String get()
	    {
	        return "Welcome "+Name;
	    }
}