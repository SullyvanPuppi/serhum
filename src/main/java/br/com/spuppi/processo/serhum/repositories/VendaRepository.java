package br.com.spuppi.processo.serhum.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.spuppi.processo.serhum.models.Venda;

public interface VendaRepository  extends CrudRepository<Venda, String>{

	@Query(nativeQuery = true, value = "SELECT sum(valor) from tb_vendas WHERE campanha_id is not null;")
	Integer getFaturamentoCampanhas();
	
	@Query(nativeQuery = true, value = "SELECT sum(valor) from tb_vendas WHERE qt_parcelas = 1;")
	Integer getFaturamentoAvista();
	
	@Query(nativeQuery = true, value = "SELECT sum(valor) from tb_vendas WHERE qt_parcelas > 1 AND qt_parcelas < 4;")
	Integer getFaturamentoParcelado();
	
}
