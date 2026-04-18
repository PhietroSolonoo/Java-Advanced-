package br.com.fiap.api_rest.model;
import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Cliente {
    @Id
    private String cpf;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String telefone;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
