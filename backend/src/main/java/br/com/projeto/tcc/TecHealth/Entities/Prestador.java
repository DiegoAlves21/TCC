package br.com.projeto.tcc.TecHealth.Entities;

import java.sql.Date;

import br.com.projeto.tcc.TechHealth.Enum.TipoInstituicao;
import br.com.projeto.tcc.TechHealth.Enum.TipoPrestador;

public class Prestador {
	private int id;
	private String nome;
	private Date dataIniVigencia;
	private Date dataFimVigencia;
	private TipoPrestador tipoPrestador;
	private Endereco endereco;
	private TipoInstituicao tipoInstituicao;
	
	
}
