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
@Table(name = "consulta")
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String horario;
	private Date dataConsulta;
	private String prontuario;
	
	@ManyToOne
	@JoinColumn(name = "pacienteId")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "prestadorId")
	private Prestador prestador;
	
	@OneToMany(mappedBy = "consultaProfissionalSaude")
	private List<ProfissionalSaude> profissionaisSaude;
}
