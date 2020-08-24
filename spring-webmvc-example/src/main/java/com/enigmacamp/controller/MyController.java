package com.enigmacamp.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String home(Model model) {
		var words = List.of("mountain", "noon", "rock", "river", "spring");
		model.addAttribute("words", words);
		return "index";
	}
}