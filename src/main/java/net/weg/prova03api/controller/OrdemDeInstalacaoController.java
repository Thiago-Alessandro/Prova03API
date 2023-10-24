package net.weg.prova03api.controller;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.OrdemInstalacao;
import net.weg.prova03api.service.OrdemDeInstalacaoService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/ordemInstalacao")
public class OrdemDeInstalacaoController {

    private OrdemDeInstalacaoService ordemDeInstalacaoService;

    @GetMapping("/{id}")
    public OrdemInstalacao buscarUm(@PathVariable Integer id) {
        return ordemDeInstalacaoService.buscarOrdem(id);
    }

    @GetMapping
    public Collection<OrdemInstalacao> buscarTodos() {
        return ordemDeInstalacaoService.buscarTodos();
    }

    @DeleteMapping
    public void remover(@RequestParam Integer id){
        ordemDeInstalacaoService.remover(id);
    }

    @PostMapping
    public void inserir(@RequestBody OrdemInstalacao ordemInstalacao){
        ordemDeInstalacaoService.salvar(ordemInstalacao);
    }

    @PutMapping
    public void atualizar(@RequestBody OrdemInstalacao ordemInstalacao){
        ordemDeInstalacaoService.salvar(ordemInstalacao);
    }

}
