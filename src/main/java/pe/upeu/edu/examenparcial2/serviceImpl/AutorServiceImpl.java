package pe.upeu.edu.examenparcial2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upeu.edu.examenparcial2.entity.Autor;
import pe.upeu.edu.examenparcial2.repository.AutorRepository;
import pe.upeu.edu.examenparcial2.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{
	
	@Autowired
	private AutorRepository autorRepository;
	
	@Override
	public Autor create(Autor autor) {
		// TODO Auto-generated method stub
		return autorRepository.save(autor);
	}

	@Override
	public List<Autor> readAll() {
		// TODO Auto-generated method stub
		return autorRepository.findAll();
	}

	@Override
	public Autor read(int id) {
		// TODO Auto-generated method stub
		return autorRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		autorRepository.deleteById(id);
	}

	@Override
	public Autor update(Autor autor) {
		// TODO Auto-generated method stub
		return autorRepository.save(autor);
	}

}
