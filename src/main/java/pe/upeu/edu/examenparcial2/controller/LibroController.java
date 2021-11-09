package pe.upeu.edu.examenparcial2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.upeu.edu.examenparcial2.entity.Libro;
import pe.upeu.edu.examenparcial2.service.LibroService;

@RestController
@RequestMapping("/api/libros")
public class LibroController {
	
	@Autowired
	private LibroService libroService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Libro>> getLibros(){
		try {
			List<Libro> list = new ArrayList<>();
			list = libroService.readAll();
			if(list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/all/{id}")
	public ResponseEntity<Libro> getUser(@PathVariable("id") int id){
			Libro libro = libroService.read(id);
			if(libro.getId()>0) {
				return new ResponseEntity<>(libro, HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} 
	}
	
	
	@PostMapping("/post")
	public ResponseEntity<Libro> save(@RequestBody Libro lib){
		try {
			Libro li = libroService.create(new Libro(lib.getId(),lib.getTitulo(), lib.getPaginas(), lib.getDescripcion(), lib.getAutor(), lib.getEditorial()));
			return new ResponseEntity<>(li, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
		try {
			libroService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Libro> update(@RequestBody Libro li, @PathVariable("id") int id){
		try {
			Libro ul = libroService.read(id);
			if (ul.getId()>0) {
				ul.setTitulo(li.getTitulo());
				ul.setPaginas(li.getPaginas());
				ul.setDescripcion(li.getDescripcion());
				ul.setAutor(li.getAutor());
				ul.setEditorial(li.getEditorial());
				return new ResponseEntity<>(libroService.create(ul),HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
