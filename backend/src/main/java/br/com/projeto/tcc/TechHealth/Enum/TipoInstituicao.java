package br.com.projeto.tcc.TechHealth.Enum;

public enum TipoInstituicao {
	
	PUBLICA("Pública"),
	PRIVADA("Privada");
	
	private String descricao;
	
	TipoInstituicao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
