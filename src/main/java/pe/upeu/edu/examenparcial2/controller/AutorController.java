package pe.upeu.edu.examenparcial2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.upeu.edu.examenparcial2.entity.Autor;
import pe.upeu.edu.examenparcial2.service.AutorService;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
	
	@Autowired
	private AutorService autorService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Autor>> getAutores(){
		try {
			List<Autor> list = new ArrayList<>();
			list = autorService.readAll();
			if(list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
