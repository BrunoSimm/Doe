package com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade;

import java.util.Date;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;

public class Necessidade {

	private int quantidade_esperada;
	private int quantidade_atual = 0;
	private Date prazoLimite;
	private String status = "inativo";
	private Item item;

	public Necessidade(Item item, int quantidade_esperada, int quantidade_atual, Date prazoLimite, String status) {
		this.quantidade_esperada = quantidade_esperada;
        this.prazoLimite = prazoLimite;
        this.item = item;
		this.quantidade_atual = quantidade_atual;
		this.prazoLimite = prazoLimite;
		this.status = status;
	}

	public boolean atualizarNecessidade(Item item, int quantidade, Date prazoLimite, String status, int quantidade_atual) {
		return false;
	}

	public boolean receberDoacao(int quantidade) {
		return false;
	}

	public Necessidade desativarNecessidade() {
		return null;
	}

	public Necessidade ativarNecessidade() {
		return null;
	}

	public boolean delete() {
		return false;
	}


	public int getQuantidade_esperada() {
		return this.quantidade_esperada;
	}

	public void setQuantidade_esperada(int quantidade_esperada) {
		this.quantidade_esperada = quantidade_esperada;
	}

	public int getQuantidade_atual() {
		return this.quantidade_atual;
	}

	public void setQuantidade_atual(int quantidade_atual) {
		this.quantidade_atual = quantidade_atual;
	}

	public Date getPrazoLimite() {
		return this.prazoLimite;
	}

	public void setPrazoLimite(Date prazoLimite) {
		this.prazoLimite = prazoLimite;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}


}
