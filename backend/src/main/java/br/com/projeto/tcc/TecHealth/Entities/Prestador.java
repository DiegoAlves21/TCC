package br.com.projeto.tcc.TecHealth.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.projeto.tcc.TecHealth.Enum.TipoInstituicao;
import br.com.projeto.tcc.TecHealth.Enum.TipoPrestador;

@Entity
@Table(name = "prestador")
public class Prestador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private Date dataIniVigencia;
	private Date dataFimVigencia;
	
	@Enumerated(EnumType.STRING)
	private TipoPrestador tipoPrestador;
	
	@Enumerated(EnumType.STRING)
	private TipoInstituicao tipoInstituicao;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "enderecoId")
	private Endereco endereco;
	
	@OneToMany(mappedBy = "prestador")
	private List<Leito> leito;
	
	@OneToMany(mappedBy = "prestador")
	private List<ProfissionalSaude> profissionalSaude;
	
	public Prestador() {
		
	}

	public Prestador(int id, String nome, Date dataIniVigencia, Date dataFimVigencia, TipoPrestador tipoPrestador,
			TipoInstituicao tipoInstituicao, Endereco endereco, List<Leito> leito,
			List<ProfissionalSaude> profissionalSaude) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataIniVigencia = dataIniVigencia;
		this.dataFimVigencia = dataFimVigencia;
		this.tipoPrestador = tipoPrestador;
		this.tipoInstituicao = tipoInstituicao;
		this.endereco = endereco;
		this.leito = leito;
		this.profissionalSaude = profissionalSaude;
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

	public Date getDataIniVigencia() {
		return dataIniVigencia;
	}

	public void setDataIniVigencia(Date dataIniVigencia) {
		this.dataIniVigencia = dataIniVigencia;
	}

	public Date getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(Date dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public TipoPrestador getTipoPrestador() {
		return tipoPrestador;
	}

	public void setTipoPrestador(TipoPrestador tipoPrestador) {
		this.tipoPrestador = tipoPrestador;
	}

	public TipoInstituicao getTipoInstituicao() {
		return tipoInstituicao;
	}

	public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
		this.tipoInstituicao = tipoInstituicao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Leito> getLeito() {
		return leito;
	}

	public void setLeito(List<Leito> leito) {
		this.leito = leito;
	}

	public List<ProfissionalSaude> getProfissionalSaude() {
		return profissionalSaude;
	}

	public void setProfissionalSaude(List<ProfissionalSaude> profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}
	
}
