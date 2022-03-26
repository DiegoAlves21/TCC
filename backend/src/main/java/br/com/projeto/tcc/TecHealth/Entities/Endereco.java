package br.com.projeto.tcc.TecHealth.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=50)
	private String logradouro;
	
	@Column(length=8)
	private String cep;
	
	@Column(length=40)
	private String bairro;
	
	@Column(length=40)
	private String municipio;
	
	@Column(length=2)
	private String uf;
	
	@Column(length=100)
	private String latitude;
	
	@Column(length=100)
	private String longitude;
	
	public Endereco(int id, String logradouro, String cep, String bairro, String municipio, String uf, String latitude,
			String longitude) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
}
