package com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade;

import java.util.Date;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;

public class Necessidade {

	private int quantidade_esperada;

	private int quantidade_atual = 0;

	private Date prazoLimite;

	private String status = inativo;

	public Necessidade Necessidade(Item item, int quantidade_esperada, int quantidade_atual, Date prazoLimite, String status) {
		return null;
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

}
