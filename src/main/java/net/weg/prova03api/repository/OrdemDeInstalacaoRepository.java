package net.weg.prova03api.repository;

import net.weg.prova03api.model.OrdemInstalacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemDeInstalacaoRepository extends JpaRepository<OrdemInstalacao, Integer> {
}
