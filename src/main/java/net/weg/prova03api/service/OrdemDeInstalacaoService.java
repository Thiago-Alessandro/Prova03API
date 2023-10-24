package net.weg.prova03api.service;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.OrdemInstalacao;
import net.weg.prova03api.repository.OrdemDeInstalacaoRepository;
import net.weg.prova03api.repository.OrdemDeManutencaoRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collection;

@Service
@AllArgsConstructor
public class OrdemDeInstalacaoService {

    private OrdemDeInstalacaoRepository ordemDeInstalacaoRepository;

    public void salvar(OrdemInstalacao ordem) {
        ordemDeInstalacaoRepository.save(ordem);
    }

    public OrdemInstalacao buscarOrdem(Integer id) {
        return ordemDeInstalacaoRepository.findById(id).get();
    }

    public Collection<OrdemInstalacao> buscarTodos(){
        return ordemDeInstalacaoRepository.findAll();
    }

    public void remover(Integer id) {
        ordemDeInstalacaoRepository.deleteById(id);
    }

}
