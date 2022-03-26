package br.com.projeto.tcc.TecHealth.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.tcc.TecHealth.Entities.Prestador;


public interface PrestadorRepository extends JpaRepository<Prestador, Long> {
	
}