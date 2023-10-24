package net.weg.prova03api.service;

import lombok.AllArgsConstructor;
import net.weg.prova03api.model.Administrador;
import net.weg.prova03api.repository.AdministradorRepository;
import net.weg.prova03api.repository.AtendenteRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collection;

@Service
@AllArgsConstructor
public class AdministradorService {

    private AdministradorRepository administradorRepository;

    public void salvar(Administrador administrador) {
        administradorRepository.save(administrador);
    }

    public Administrador buscarUsuario(Long id){
        return administradorRepository.findById(id).get();
    }

    public Collection<Administrador> buscarTodos(){
        return administradorRepository.findAll();
    }

    public void remover(Long id){
        administradorRepository.deleteById(id);
    }

}
