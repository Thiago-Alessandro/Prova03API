package net.weg.prova03api.controller;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.Solicitante;
import net.weg.prova03api.service.SolicitanteService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/solicitante")
public class SolicitenteController {

    private SolicitanteService solicitanteService;

    @GetMapping("/{id}")
    public Solicitante buscarUm(@PathVariable Long id){
        return solicitanteService.buscarUsuario(id);
    }

    @GetMapping
    public Collection<Solicitante> buscarTodos(){
        return solicitanteService.buscarTodos();
    }

    @DeleteMapping
    public void remover(@RequestParam Long id){
        solicitanteService.remover(id);
    }

    @PostMapping
    public void inserir(@RequestBody Solicitante solicitante){
        solicitanteService.salvar(solicitante);
    }

    @PutMapping
    public void atualizar(@RequestBody Solicitante solicitante){
        solicitanteService.salvar(solicitante);
    }


}
