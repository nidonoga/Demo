package com.nido.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PainelController {

	@GetMapping("/painel")
	public String painel() {
		return "painel";
	}

	
}
