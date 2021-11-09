package pe.upeu.edu.examenparcial2.service;

import java.util.List;

import pe.upeu.edu.examenparcial2.entity.Autor;


public interface AutorService {
	Autor create(Autor autor);
	List<Autor> readAll();
	Autor read(int id);
	void delete(int id);
	Autor update(Autor autor);
}
