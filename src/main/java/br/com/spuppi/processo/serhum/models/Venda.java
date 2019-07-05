package br.com.spuppi.processo.serhum.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vendas")
public class Venda {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	Long id;
	
	@ManyToOne
	Produto produto;
	
	@ManyToOne
	Campanha campanha;
	
}
