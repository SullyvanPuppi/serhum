package br.com.spuppi.processo.serhum.services;

import java.util.List;

import br.com.spuppi.processo.serhum.models.Venda;

public interface RelatorioInterface {
	
	Integer calcularTotal(List<Venda> lista);

}
