package com.pds.doe.Model.Repositorios.NecessidadeRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import java.util.Date;

public interface IRepositorioNecessidade {

	private Necessidade[] necessidade;

	public abstract Necessidade salvarNecessidade(Item item, int quantidade_esperada, int quantidade_atual, Date prazoLimite, String status);

	public abstract boolean excluirNecessidade(Necessidade necessidade);

	public abstract Necessidade atualizarNecessidade(Necessidade necessidade);

}
