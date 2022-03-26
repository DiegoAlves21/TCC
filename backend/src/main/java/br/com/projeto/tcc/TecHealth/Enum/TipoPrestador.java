package br.com.projeto.tcc.TecHealth.Enum;

public enum TipoPrestador {
	POSTO_DE_SAUDE("Posto de Saúde"),
	HOSPITAL("Hospital"),
	LABORATORIO("Laboratório"),
	CLINICA_MEDICA("Clínica Médica");
	
	private String descricao;
	
	TipoPrestador(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
