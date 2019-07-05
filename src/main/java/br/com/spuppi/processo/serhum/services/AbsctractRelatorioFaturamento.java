package br.com.spuppi.processo.serhum.services;

import java.util.List;

import br.com.spuppi.processo.serhum.models.Venda;

public class AbsctractRelatorioFaturamento implements RelatorioInterface{

	@Override
	public Integer calcularTotal(List<Venda> lista) {
		
		int total = 0;
		
		for(Venda venda : lista) {
			total += venda.getValor();
		}
		
		return total;
	}
	
	public Integer aplicarTaxas(Integer valorVenda, List<Integer> taxas) {
		
		for(Integer taxa : taxas) {
			if(taxa > 100 || taxa < 0) {
				continue;
			}
			valorVenda += valorVenda * taxa;
		}
		
		return valorVenda;
	}
}
