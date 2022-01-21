package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello") //URI - Identificação de um Recurso na Internet
//não precisaria colocar esse comando quando utiliza o URI ao lado do @GetMapping

public class HelloController {

	@GetMapping("/Exercicio1")
	public String Exercicio1() {
		return "Persistência, Comunicação, Trabalho em equipe.";
	}
	
	@GetMapping("/Exercicio2")
	public String Exercicio2() {
		return "Aprender CRUD!!!!!!!";
	}
	
}
