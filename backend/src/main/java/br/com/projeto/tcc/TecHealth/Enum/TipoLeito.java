package br.com.projeto.tcc.TecHealth.Enum;

public enum TipoLeito {
	ENFERMARIA("Enfermaria"),
	UTI("UTI"),
	APARTAMENTO("Apartamento");
	
	private String descricao;
	
	TipoLeito(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
