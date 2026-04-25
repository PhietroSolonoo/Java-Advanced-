package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

    //SELECT DISTINCT(nome) FROM produto;
    Produto findDistincNomeBy();

    // SELECT * FROM produto ORDER BY preco DESC LIMIT 3;
    List<Produto> findTop3ByPreco();

    //SELECT * FROM produto WHERE UPPER(nome) = UPPER (nome);
    List<Produto> findByNomeEqualsIgnoreCase(String nome);
    List<Produto> findByNomeIsNot(String nome);
    List<Produto> findByPedidosIsNotNull();
    List<Produto> findByAtivoTrue();
    //SELECT * FROM produto WHERE nome LIKE '%narg';
    List<Produto> findByNomeStartingWith(String str);

}
