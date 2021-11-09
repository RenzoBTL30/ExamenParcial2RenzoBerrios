package pe.upeu.edu.examenparcial2.service;

import java.util.List;

import pe.upeu.edu.examenparcial2.entity.Libro;

public interface LibroService {
	Libro create(Libro libro);
	List<Libro> readAll();
	Libro read(int id);
	void delete(int id);
	Libro update(Libro libro);
}
