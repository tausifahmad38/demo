package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/check")
	public String show(){
		return "<b>Hi..!<b><br> Its working fine....";
	}

}
