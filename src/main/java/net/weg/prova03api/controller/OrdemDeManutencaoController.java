package net.weg.prova03api.controller;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.OrdemManutencao;
import net.weg.prova03api.service.OrdemDeInstalacaoService;
import net.weg.prova03api.service.OrdemDeManutencaoService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/ordemManutencao")
public class OrdemDeManutencaoController {

    private OrdemDeManutencaoService ordemDeManutencaoService;

    @GetMapping("/{id}")
    public OrdemManutencao buscarUm(@PathVariable Integer id){
        return ordemDeManutencaoService.buscarOrdem(id);
    }

    @GetMapping
    public Collection<OrdemManutencao> buscarTodos(){
        return ordemDeManutencaoService.buscarTodos();
    }

    @DeleteMapping
    public void remover(@RequestParam Integer id) {
        ordemDeManutencaoService.remover(id);
    }

    @PostMapping
    public void inserir(@RequestBody OrdemManutencao ordemManutencao){
        ordemDeManutencaoService.salvar(ordemManutencao);
    }

    @PutMapping
    public void atualizar(@RequestBody OrdemManutencao ordemManutencao){
        ordemDeManutencaoService.salvar(ordemManutencao);
    }

}
