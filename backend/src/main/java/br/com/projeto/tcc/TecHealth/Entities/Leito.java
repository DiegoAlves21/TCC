package br.com.projeto.tcc.TecHealth.Entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.projeto.tcc.TechHealth.Enum.TipoLeito;

@Entity
@Table(name = "leito")
public class Leito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int quantidade;
	
	@Enumerated(EnumType.STRING)
	private TipoLeito tipoLeito;
	
	public Leito() {
		
	}

	public Leito(int id, int quantidade, TipoLeito tipoLeito) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.tipoLeito = tipoLeito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public TipoLeito getTipoLeito() {
		return tipoLeito;
	}

	public void setTipoLeito(TipoLeito tipoLeito) {
		this.tipoLeito = tipoLeito;
	}

}
