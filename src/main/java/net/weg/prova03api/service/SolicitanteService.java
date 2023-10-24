package net.weg.prova03api.service;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.Solicitante;
import net.weg.prova03api.repository.AdministradorRepository;
import net.weg.prova03api.repository.SolicitanteRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collection;

@Service
@AllArgsConstructor
public class SolicitanteService {

    private SolicitanteRepository solicitanteRepository;

    public void salvar(Solicitante solicitante) {
        solicitanteRepository.save(solicitante);
    }

    public Solicitante buscarUsuario(Long id) {
        return solicitanteRepository.findById(id).get();
    }

    public Collection<Solicitante> buscarTodos() {
        return solicitanteRepository.findAll();
    }

    public void remover(Long id){
        solicitanteRepository.deleteById(id);
    }

}
