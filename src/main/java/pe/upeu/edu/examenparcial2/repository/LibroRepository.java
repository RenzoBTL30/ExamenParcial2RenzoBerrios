package pe.upeu.edu.examenparcial2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.upeu.edu.examenparcial2.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
