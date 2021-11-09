package pe.upeu.edu.examenparcial2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.upeu.edu.examenparcial2.entity.Editorial;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer>{

}
