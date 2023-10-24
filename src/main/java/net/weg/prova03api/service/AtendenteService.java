package net.weg.prova03api.service;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.Atendente;
import net.weg.prova03api.repository.AtendenteRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collection;

@Service
@AllArgsConstructor
public class AtendenteService {

    private AtendenteRepository atendenteRepository;

    public void salvar(Atendente atendente) {
        atendenteRepository.save(atendente);
    }

    public Atendente buscarUsuario(Long id){
        return atendenteRepository.findById(id).get();
    }

    public Collection<Atendente> buscarTodos(){
        return atendenteRepository.findAll();
    }

    public void remover(Long id){
        atendenteRepository.deleteById(id);
    }

}
