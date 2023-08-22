package com.example.project.que3controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class que3 {
	@Value("Green")
	public String colour;
	@RequestMapping("/que3")
	public String getmyfav() {
		return "My favourite colour is "+colour;
	}

}
