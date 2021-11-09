package pe.upeu.edu.examenparcial2.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upeu.edu.examenparcial2.entity.Editorial;
import pe.upeu.edu.examenparcial2.repository.EditorialRepository;
import pe.upeu.edu.examenparcial2.service.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService{
	
	@Autowired
	private EditorialRepository editorialRepository;
	
	@Override
	public Editorial create(Editorial editorial) {
		// TODO Auto-generated method stub
		return editorialRepository.save(editorial);
	}

	@Override
	public List<Editorial> readAll() {
		// TODO Auto-generated method stub
		return editorialRepository.findAll();
	}

	@Override
	public Editorial read(int id) {
		// TODO Auto-generated method stub
		return editorialRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		editorialRepository.deleteById(id);
	}

	@Override
	public Editorial update(Editorial editorial) {
		// TODO Auto-generated method stub
		return editorialRepository.save(editorial);
	}
	
}
