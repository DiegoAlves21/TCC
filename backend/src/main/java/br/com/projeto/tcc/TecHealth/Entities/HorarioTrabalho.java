package br.com.projeto.tcc.TecHealth.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "horarioTrabalho")
public class HorarioTrabalho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=20)
	private String diaDaSemana;
	
	@Column(length=10)
	private String HorarioInicial;
	
	@Column(length=10)
	private String HorarioFinal;
	
	@ManyToOne
	@JoinColumn(name = "profissionalSaudeId")
	private ProfissionalSaude profissionalSaude;
	
	@ManyToOne
	@JoinColumn(name = "prestadorId")
	private Prestador prestador;
	
	public HorarioTrabalho() {
		
	}

	public HorarioTrabalho(int id, String diaDaSemana, String horarioInicial, String horarioFinal,
			ProfissionalSaude profissionalSaude, Prestador prestador) {
		super();
		this.id = id;
		this.diaDaSemana = diaDaSemana;
		HorarioInicial = horarioInicial;
		HorarioFinal = horarioFinal;
		this.profissionalSaude = profissionalSaude;
		this.prestador = prestador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public String getHorarioInicial() {
		return HorarioInicial;
	}

	public void setHorarioInicial(String horarioInicial) {
		HorarioInicial = horarioInicial;
	}

	public String getHorarioFinal() {
		return HorarioFinal;
	}

	public void setHorarioFinal(String horarioFinal) {
		HorarioFinal = horarioFinal;
	}

	public ProfissionalSaude getProfissionalSaude() {
		return profissionalSaude;
	}

	public void setProfissionalSaude(ProfissionalSaude profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

}
