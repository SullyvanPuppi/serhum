package br.com.spuppi.processo.serhum.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tb_campanha")
public class Campanha {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long id;
	
	@NotEmpty
	String nome;
	
	int desconto;
	
	int acrescimo;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public int getAcrescimo() {
		return acrescimo;
	}
	public void setAcrescimo(int acrescimo) {
		this.acrescimo = acrescimo;
	}
	@Override
	public String toString() {
		return "Campanha [id=" + id + ", nome=" + nome + ", desconto=" + desconto + ", acrescimo=" + acrescimo + "]";
	}	
}
