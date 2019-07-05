package br.com.spuppi.processo.serhum.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.spuppi.processo.serhum.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, String>{
	
	
	@Query(nativeQuery = true, value = "SELECT sum(quantidade) FROM tb_produto WHERE nome like '%:nome%';")
	Integer totalProdutosByNomeLike(String nome);

}
