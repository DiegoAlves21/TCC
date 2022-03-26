package br.com.projeto.tcc.TecHealth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.tcc.TecHealth.Repositories.ConsultaRepository;
import br.com.projeto.tcc.TecHealth.Repositories.PrestadorRepository;
import br.com.projeto.tcc.TecHealth.Repositories.ProfissionalSaudeRepository;


@Service
public class ConsultaService {

	@Autowired
	private PrestadorRepository prestadorRepository;
	
	@Autowired
	private ProfissionalSaudeRepository profissionalSaudeRepository;
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
}
