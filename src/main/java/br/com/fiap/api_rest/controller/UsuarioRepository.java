package br.com.fiap.api_rest.controller;

import br.com.fiap.api_rest.model.Usuario;
import org.springframework.data.repository.Repository;

import java.util.UUID;

interface UsuarioRepository extends Repository<Usuario, UUID> {
    boolean findByLogin(String attr0);

    void save(Usuario novoUsuario);
}
