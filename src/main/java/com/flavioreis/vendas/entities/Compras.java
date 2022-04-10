package com.flavioreis.vendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "tb_compras")//create table tb_compras
public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//incremento
	private int id;
	private Double totalCompra;
	private LocalDate dataCompra;
	
	@ManyToOne//compras relacionadas a um cliente
	@JoinColumn(name = "cliente_id")//chave estrangeira
	private Cliente cliente;//muitas compras podem estar relacionadas a um cliente
	
	public Compras(int id, Double totalCompra, LocalDate dataCompra) {
		this.id = id;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
	}
	public Compras() {
	
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	
	
}
