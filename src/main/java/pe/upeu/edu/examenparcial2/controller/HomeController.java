package pe.upeu.edu.examenparcial2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@GetMapping("/")
String mensaje() {
	return "Bienvenido a Spring";
	}
}
