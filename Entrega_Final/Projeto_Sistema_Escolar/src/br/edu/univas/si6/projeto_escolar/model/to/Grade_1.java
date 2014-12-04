package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="grade_1")
public class Grade_1 {
	@Id
	@GeneratedValue ( strategy = GenerationType . SEQUENCE ,
	generator ="seq_grade_1")

	@SequenceGenerator ( name ="seq_grade_1",

	 sequenceName ="SEQ_GRADE_1",

	 allocationSize =1)
	private int cod;
	private String nome;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
