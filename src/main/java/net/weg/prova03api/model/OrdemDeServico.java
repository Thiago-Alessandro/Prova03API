package net.weg.prova03api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class OrdemDeServico {

    @Id
    private int numeroOrdem;
    private String descricao;
    private String status;
    @ManyToOne
    private Solicitante solicitante;

}
