package br.com.projeto.tcc.TecHealth.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.tcc.TecHealth.Entities.ProfissionalSaude;
import br.com.projeto.tcc.TecHealth.Entities.TipoExame;

public interface TipoExameRespository extends JpaRepository<TipoExame, Long>{

}
