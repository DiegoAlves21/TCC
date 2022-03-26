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
	
	@ManyToOne
	@JoinColumn(name = "especialidadeId")
	private Especialidade especialidade;
	
	@OneToMany(mappedBy = "profissionalSaudeHorTrab")
	private List<HorarioTrabalho> horarioTrabalho;
	
	public ProfissionalSaude() {
		
	}

	public ProfissionalSaude(int id, String nome, Date dataIniVigencia, Date dataFimVigencia, Boolean indMedico,
			Especialidade especialidade, List<HorarioTrabalho> horarioTrabalho) {
		super();
		this.id = id;
		Nome = nome;
		this.dataIniVigencia = dataIniVigencia;
		this.dataFimVigencia = dataFimVigencia;
		this.indMedico = indMedico;
		this.especialidade = especialidade;
		this.horarioTrabalho = horarioTrabalho;
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
	
}
