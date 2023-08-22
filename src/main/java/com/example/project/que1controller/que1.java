package com.example.project.que1controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class que1 {
	@RequestMapping("/show")
	@ResponseBody
	public String Welcome() {
		return "Welcome String Boot";
	}

}
