package pe.upeu.edu.examenparcial2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.upeu.edu.examenparcial2.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{

}
