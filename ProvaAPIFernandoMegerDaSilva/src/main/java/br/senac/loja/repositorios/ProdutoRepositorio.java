package br.senac.loja.repositorios;

import br.senac.loja.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "produtos")
public interface ProdutoRepositorio
        extends JpaRepository<Produto, Long> {
    List<Produto> searchByNome (String nome);
}
