package net.weg.prova03api.service;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.OrdemManutencao;
import net.weg.prova03api.repository.OrdemDeManutencaoRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collection;

@Service
@AllArgsConstructor
public class OrdemDeManutencaoService {

    private OrdemDeManutencaoRepository ordemDeManutencaoRepository;

    public void salvar(OrdemManutencao ordem) {
        ordemDeManutencaoRepository.save(ordem);
    }

    public OrdemManutencao buscarOrdem(Integer id){
        return ordemDeManutencaoRepository.findById(id).get();
    }

    public Collection<OrdemManutencao> buscarTodos() {
        return ordemDeManutencaoRepository.findAll();
    }

    public void remover(Integer id) {
        ordemDeManutencaoRepository.deleteById(id);
    }

}
