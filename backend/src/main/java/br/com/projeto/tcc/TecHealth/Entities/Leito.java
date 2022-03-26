package br.com.projeto.tcc.TecHealth.Entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.projeto.tcc.TecHealth.Enum.TipoLeito;

@Entity
@Table(name = "leito")
public class Leito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int quantidade;
	
	@Enumerated(EnumType.STRING)
	private TipoLeito tipoLeito;
	
	@ManyToOne
	@JoinColumn(name = "prestadorId")
	private Prestador prestador;
	
	public Leito() {
		
	}

	public Leito(int id, int quantidade, TipoLeito tipoLeito, Prestador prestador) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.tipoLeito = tipoLeito;
		this.prestador = prestador;
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

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	
	
	
}
