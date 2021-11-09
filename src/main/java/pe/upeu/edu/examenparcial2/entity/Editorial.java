package pe.upeu.edu.examenparcial2.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "editoriales")
public class Editorial implements Serializable{
	
	private static final long serialVersionUID = -962936564953879252L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ideditorial")
	private int id;
	
	private String editorial;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "editorial")
	//@JoinColumn(name="id_recurso")
	private List<Libro> libro;
}
