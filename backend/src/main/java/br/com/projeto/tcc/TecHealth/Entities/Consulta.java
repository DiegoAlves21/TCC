package br.com.projeto.tcc.TecHealth.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.projeto.tcc.TecHealth.Enum.SituacaoConsulta;

@Entity
@Table(name = "consulta")
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=10)
	private String horario;
	private Date dataConsulta;
	private Date dataAgendamento;
	@Column(length=1000)
	private String prontuario;
	
	@ManyToOne
	@JoinColumn(name = "pacienteId")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "prestadorId")
	private Prestador prestador;
	
	@ManyToMany(mappedBy = "consulta")
	private List<ProfissionalSaude> profissionalSaude;
	
	@ManyToOne
	@JoinColumn(name = "tipoExameId")
	private TipoExame tipoExame;
	
	@ManyToOne
	@JoinColumn(name = "tipoProcedimentoId")
	private TipoProcedimento tipoProcedimento;
	
	@Column(length=10)
	@Enumerated(EnumType.STRING)
	private SituacaoConsulta situacao;

	public Consulta(int id, String horario, Date dataConsulta, Date dataAgendamento, String prontuario,
			Paciente paciente, Prestador prestador, List<ProfissionalSaude> profissionaisSaude, TipoExame tipoExame,
			TipoProcedimento tipoProcedimento, SituacaoConsulta situacao) {
		super();
		this.id = id;
		this.horario = horario;
		this.dataConsulta = dataConsulta;
		this.dataAgendamento = dataAgendamento;
		this.prontuario = prontuario;
		this.paciente = paciente;
		this.prestador = prestador;
		this.profissionalSaude = profissionaisSaude;
		this.tipoExame = tipoExame;
		this.tipoProcedimento = tipoProcedimento;
		this.situacao = situacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador prestador) {
		this.prestador = prestador;
	}

	public List<ProfissionalSaude> getProfissionaisSaude() {
		return profissionalSaude;
	}

	public void setProfissionaisSaude(List<ProfissionalSaude> profissionaisSaude) {
		this.profissionalSaude = profissionaisSaude;
	}

	public TipoExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TipoExame tipoExame) {
		this.tipoExame = tipoExame;
	}

	public TipoProcedimento getTipoProcedimento() {
		return tipoProcedimento;
	}

	public void setTipoProcedimento(TipoProcedimento tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}

	public SituacaoConsulta getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoConsulta situacao) {
		this.situacao = situacao;
	}
	
}
