package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	@RequestMapping("/hello")
	public String index() {
		return "hello";
	}

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@RequestMapping("/greeting/{name}")
	public String greetingPath(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	@RequestMapping("/perkalian")
	public String greeting(@RequestParam(value = "a", required = false) Integer a,
			@RequestParam(value = "b", required = false) Integer b, Model model) {
		if (a == null)
			a = 0;
		if (b == null)
			b = 0;
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		return "perkalian";
	}
}
