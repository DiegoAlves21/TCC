package br.com.projeto.tcc.TecHealth.Entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=50)
	private String nome;
	
	@Column(length=11)
	private String cpf;
	
	private Date dataNascimento;
	
	@Column(length=10)
	private String rg;
	
	@Column(length=12)
	private String celular;
	
	@Column(length=200)
	private String cartaoVacina;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "enderecoId")
	private Endereco endereco;
	
	public Paciente() {
		
	}

	public Paciente(int id, String nome, String cpf, Date dataNascimento, String rg, String celular,
			String cartaoVacina, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.celular = celular;
		this.cartaoVacina = cartaoVacina;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCartaoVacina() {
		return cartaoVacina;
	}

	public void setCartaoVacina(String cartaoVacina) {
		this.cartaoVacina = cartaoVacina;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
