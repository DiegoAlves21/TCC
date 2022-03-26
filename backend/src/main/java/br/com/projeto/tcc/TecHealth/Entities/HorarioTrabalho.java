package br.com.projeto.tcc.TecHealth.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horarioTrabalho")
public class HorarioTrabalho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String diaDaSemana;
	private String HorarioInicial;
	private String HorarioFinal;
	
	public HorarioTrabalho() {
		
	}

	public HorarioTrabalho(int id, String diaDaSemana, String horarioInicial, String horarioFinal) {
		super();
		this.id = id;
		this.diaDaSemana = diaDaSemana;
		HorarioInicial = horarioInicial;
		HorarioFinal = horarioFinal;
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
	
}
