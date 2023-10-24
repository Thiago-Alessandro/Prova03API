package net.weg.prova03api.repository;

import net.weg.prova03api.model.OrdemManutencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemDeManutencaoRepository extends JpaRepository<OrdemManutencao, Integer> {
}
