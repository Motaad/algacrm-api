package com.algaworks.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="clientes")
public class Cliente {

	public Cliente(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Cliente() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nome;

}
