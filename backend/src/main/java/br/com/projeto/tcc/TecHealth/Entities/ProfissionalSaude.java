package br.com.projeto.tcc.TecHealth.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profissionalSaude")
public class ProfissionalSaude {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Nome;
	private Date dataIniVigencia;
	private Date dataFimVigencia;
	private Boolean indMedico;
	private String cpf;
	
	@ManyToOne
	@JoinColumn(name = "especialidadeId")
	private Especialidade especialidade;
	
	@OneToMany(mappedBy = "profissionalSaude")
	private List<HorarioTrabalho> horarioTrabalho;
	
	@ManyToOne
	@JoinColumn(name = "consultaId")
	private Consulta consulta;
	
	@ManyToOne
	@JoinColumn(name = "prestadorId")
	private Prestador prestador;
	
	public ProfissionalSaude() {
		
	}

	public ProfissionalSaude(int id, String nome, Date dataIniVigencia, Date dataFimVigencia, Boolean indMedico,
			String cpf, Especialidade especialidade, List<HorarioTrabalho> horarioTrabalho, Consulta consulta,
			Prestador prestador) {
		super();
		this.id = id;
		Nome = nome;
		this.dataIniVigencia = dataIniVigencia;
		this.dataFimVigencia = dataFimVigencia;
		this.indMedico = indMedico;
		this.cpf = cpf;
		this.especialidade = especialidade;
		this.horarioTrabalho = horarioTrabalho;
		this.consulta = consulta;
		this.prestador = prestador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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

	public Boolean getIndMedico() {
		return indMedico;
	}

	public void setIndMedico(Boolean indMedico) {
		this.indMedico = indMedico;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public List<HorarioTrabalho> getHorarioTrabalho() {
		return horarioTrabalho;
	}

	public void setHorarioTrabalho(List<HorarioTrabalho> horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}
	
}
