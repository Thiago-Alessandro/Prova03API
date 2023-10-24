package net.weg.prova03api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "cpf")
public class Solicitante extends Usuario{

    @OneToMany(mappedBy = "solicitante")
    //em relacoes OneToMany - ManyToOne o mappedBy vai na relacao OneToMany
    @JsonIgnore
    private List<OrdemDeServico> ordens;

}
