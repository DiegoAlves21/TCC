package br.com.projeto.tcc.TecHealth.Entities;

public class Endereco {
	private int id;
	private String logradouro;
	private String cep;
	private String bairro;
	private String municipio;
	private String uf;
	private String latitude;
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
