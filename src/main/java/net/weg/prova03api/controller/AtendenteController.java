package net.weg.prova03api.controller;


import lombok.AllArgsConstructor;
import net.weg.prova03api.model.Atendente;
import net.weg.prova03api.service.AtendenteService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/atendente")
public class AtendenteController {

    private AtendenteService atendenteService;

    @GetMapping("/{id}")
    public Atendente buscarUm(@PathVariable Long id) {
        return atendenteService.buscarUsuario(id);
    }

    @GetMapping
    public Collection<Atendente> buscarTodos(){
        return atendenteService.buscarTodos();
    }

    @DeleteMapping
    public void remover(@RequestParam Long id){
        atendenteService.remover(id);
    }

    @PostMapping
    public void inserir(@RequestBody Atendente atendente){
        atendenteService.salvar(atendente);
    }

    @PutMapping
    public void atualizar(@RequestBody Atendente atendente){
        atendenteService.salvar(atendente);
    }


}
