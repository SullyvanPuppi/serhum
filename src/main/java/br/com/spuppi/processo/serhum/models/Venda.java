package br.com.spuppi.processo.serhum.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
	
	@NotNull
	Integer valor;
	
	@NotNull
	Integer qtParcelas;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Campanha getCampanha() {
		return campanha;
	}
	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Integer getQtParcelas() {
		return qtParcelas;
	}
	public void setQtParcelas(Integer qtParcelas) {
		this.qtParcelas = qtParcelas;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", produto=" + produto + ", campanha=" + campanha + ", valor=" + valor
				+ ", qtParcelas=" + qtParcelas + "]";
	}
}
