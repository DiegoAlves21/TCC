package br.com.projeto.tcc.TecHealth.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especialidade")
public class Especialidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=50)
	private String NomeEspecialidade;
	
	public Especialidade() {
		
	}
	
	public Especialidade(int id, String nomeEspecialidade) {
		super();
		this.id = id;
		NomeEspecialidade = nomeEspecialidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEspecialidade() {
		return NomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		NomeEspecialidade = nomeEspecialidade;
	}
	
}
