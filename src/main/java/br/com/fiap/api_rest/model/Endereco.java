package br.com.fiap.api_rest.model;

import jakarta.persistence.*;
import org.hibernate.metamodel.internal.StandardEmbeddableInstantiator;

import java.util.UUID;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String logradouro;
    private String numero;
    private String complemento;
    private  String cidade;
    private String bairro;
    private String estado;
    private String cep;
    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

    public UUID getId() {
        return id;
    }

}
