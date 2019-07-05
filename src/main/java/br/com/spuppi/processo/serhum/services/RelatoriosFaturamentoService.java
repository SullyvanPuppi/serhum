package br.com.spuppi.processo.serhum.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.spuppi.processo.serhum.repositories.ProdutoRepository;
import br.com.spuppi.processo.serhum.repositories.VendaRepository;

public class RelatoriosFaturamentoService extends AbsctractRelatorioFaturamento{

	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public Integer relatorioEstoqueTotalProduto(String nome){
		return produtoRepository.totalProdutosByNomeLike(nome);
	}
	
	public Integer relatorioFaturamentoPromo(){
		return vendaRepository.getFaturamentoCampanhas();
	}
	
	public Integer relatorioFaturamentoAvista(){
		return vendaRepository.getFaturamentoAvista();
	}
	
	public Integer relatorioFaturamentoParcelado(){
		return vendaRepository.getFaturamentoParcelado();
	}
}
