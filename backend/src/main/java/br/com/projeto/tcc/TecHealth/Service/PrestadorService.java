package br.com.projeto.tcc.TecHealth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.tcc.TecHealth.Repositories.PrestadorRepository;

@Service
public class PrestadorService {
	
	@Autowired
	private PrestadorRepository prestadorRepository;

}
