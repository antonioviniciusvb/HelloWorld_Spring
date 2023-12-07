package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello turma 68!!!</b>";
	}
	
	@GetMapping("/bsmGeneration")
	public String bsmGeneration() {
		return "<b>BSM’s da Generation Brasil</b><br><br>"
				+ "<b>[Mentalidades]</b><br>"
				+ "Persistência<br>Responsabilidade pessoal<br>Orientação ao futuro<br>Mentalidade de crescimento<br><br>"
				+ "<b>[Comportamentais]</b><br>"
				+ "Comunicação<br>Proatividade<br>Orientação aos detalhes<br>Trabalho em Equipe";
	}
	
	@GetMapping("/goals")
	public String goals() {
		return "Learn about spring and start implementing the \"Personal Blog\" project.";
	}

}
