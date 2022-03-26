package br.com.projeto.tcc.TecHealth.Enum;

public enum SituacaoConsulta {
	PENDENTE("Pendente"),
	REALIZADA("Realizada"),
	CANCELADA("Cancelada");
	
	private String descricao;
	
	SituacaoConsulta(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
