package com.example.demo.Controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Color {
	private String yourFavClr="Blue";
    @GetMapping("/")
    public String getMyFav(){
        return "My Fav Clr is "+yourFavClr;
    }
}
