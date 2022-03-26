package br.com.projeto.tcc.TecHealth.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.tcc.TecHealth.Entities.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
	
}
