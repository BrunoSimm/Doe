package com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "necessidades")
public class Necessidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private int quantidade_esperada;
	
	@Column()
	private int quantidade_atual = 0;
	
	@Column
	private Date prazoLimite;
	
	@Column()
	private String status = "inativo";
	
	@JoinColumn(name = "item_id")
	@NotBlank(message = "Item Id é obrigatório!")
	private Long itemId;

	public Necessidade(Long id, int quantidade_esperada, int quantidade_atual, Date prazoLimite, String status,
			@NotBlank(message = "Item Id é obrigatório!") Long itemId) {
		this.id = id;
		this.quantidade_esperada = quantidade_esperada;
		this.quantidade_atual = quantidade_atual;
		this.prazoLimite = prazoLimite;
		this.status = status;
		this.itemId = itemId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade_esperada() {
		return quantidade_esperada;
	}

	public void setQuantidade_esperada(int quantidade_esperada) {
		this.quantidade_esperada = quantidade_esperada;
	}

	public int getQuantidade_atual() {
		return quantidade_atual;
	}

	public void setQuantidade_atual(int quantidade_atual) {
		this.quantidade_atual = quantidade_atual;
	}

	public Date getPrazoLimite() {
		return prazoLimite;
	}

	public void setPrazoLimite(Date prazoLimite) {
		this.prazoLimite = prazoLimite;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "Necessidade [id=" + id + ", itemId=" + itemId + ", prazoLimite=" + prazoLimite + ", quantidade_atual="
				+ quantidade_atual + ", quantidade_esperada=" + quantidade_esperada + ", status=" + status + "]";
	}
}
