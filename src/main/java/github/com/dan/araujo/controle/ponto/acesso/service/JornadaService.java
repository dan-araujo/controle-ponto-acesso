package github.com.dan.araujo.controle.ponto.acesso.service;

import github.com.dan.araujo.controle.ponto.acesso.model.JornadaTrabalho;
import github.com.dan.araujo.controle.ponto.acesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho salvarJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> listarTodos() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> encontrarPorId(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho atualizarJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deletarJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
