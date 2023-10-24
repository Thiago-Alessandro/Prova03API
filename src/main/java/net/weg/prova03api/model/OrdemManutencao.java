package net.weg.prova03api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "numeroOrdem")
public class OrdemManutencao extends OrdemDeServico{

    private String equipamento;
    private String dataManutencao;

}
