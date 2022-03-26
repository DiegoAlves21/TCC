package br.com.projeto.tcc.TecHealth.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.tcc.TecHealth.Entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
