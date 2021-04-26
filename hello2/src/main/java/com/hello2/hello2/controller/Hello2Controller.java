package com.hello2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello2Controller {
	@RequestMapping ("/hello")

public String hello () {
	return "Olá, mundo";
}


@RequestMapping ("/Hello")
@GetMapping 
public String habilidadeMentalidade () {
	return "Mentalidade: Persistência. \nHabilidade: Atenção aos detalhes.";
}
@RequestMapping ("/Objetivo")
@GetMapping 
public String objetivoSemana () {
	return "Objetivo de aprendizagem semanal: Aprender e executar não só os API REST como também RESTfull; \nCompreender os Status HTTP; \nExecutar as camadas API REST. ";
}

}
