package net.weg.prova03api.controller;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.Administrador;
import net.weg.prova03api.service.AdministradorService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/administrador")
public class AdministradorController {

    private AdministradorService administradorService;

    @GetMapping("/{id}")
    public Administrador buscarUm(@PathVariable Long id){
        return administradorService.buscarUsuario(id);
    }

    @GetMapping
    public Collection<Administrador> buscarTodos(){
        return administradorService.buscarTodos();
    }

    @DeleteMapping
    public void remover(@RequestParam Long id){
        administradorService.remover(id);
    }

    @PostMapping
    public void inserir(@RequestBody Administrador administrador){
        administradorService.salvar(administrador);
    }

    @PutMapping
    public void atualizar(@RequestBody Administrador administrador){
        administradorService.salvar(administrador);
    }

}
