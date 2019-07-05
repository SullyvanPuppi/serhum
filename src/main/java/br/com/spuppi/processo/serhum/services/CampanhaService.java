package br.com.spuppi.processo.serhum.services;

import java.util.ArrayList;
import java.util.List;

public class CampanhaService {
	
	public List<Integer> calcularPromocao(List<Integer> 
		lista){
		
		List<Integer> novaLista = new ArrayList<Integer>();
		
		for(Integer valor : lista) {
			valor += valor;
			DoisEmUm doisEmUm = new DoisEmUm();
			novaLista.add(doisEmUm.calcular(valor));
		}
		
		return novaLista;
	}
	
	public List<Integer> calcularPromocao(List<Integer> lista, Estoque estoque){
		
		List<Integer> novaLista = new ArrayList<Integer>();
		
		for(Integer valor : lista) {
			valor += valor;
			novaLista.add(estoque.calcular(valor));
		}
		
		return novaLista;
	}
}
