package pe.upeu.edu.examenparcial2.service;

import java.util.List;

import pe.upeu.edu.examenparcial2.entity.Editorial;

public interface EditorialService {
	Editorial create(Editorial editorial);
	List<Editorial> readAll();
	Editorial read(int id);
	void delete(int id);
	Editorial update(Editorial editorial);
}
