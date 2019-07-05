package br.com.spuppi.processo.serhum.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.spuppi.processo.serhum.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, String>{

}
