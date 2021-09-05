package github.com.dan.araujo.controle.ponto.acesso.repository;

import github.com.dan.araujo.controle.ponto.acesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
