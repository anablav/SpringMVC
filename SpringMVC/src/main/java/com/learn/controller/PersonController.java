package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.model.Person;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String Person(Model model) {
		com.learn.model.Person person = new Person();
		person.setFirstName("Ana");
		person.setLastName("Kushi");
		person.setAge(20);
		model.addAttribute("person", person);
		return "personview";
	}
	
	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "My Spring Boot App";
	}
}
