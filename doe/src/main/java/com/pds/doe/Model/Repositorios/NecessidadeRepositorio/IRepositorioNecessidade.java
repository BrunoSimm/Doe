package com.pds.doe.Model.Repositorios.NecessidadeRepositorio;

import java.util.Date;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;

public interface IRepositorioNecessidade {
	
	Necessidade salvarNecessidade(Item item, int quantidade_esperada, int quantidade_atual, Date prazoLimite, String status);
	boolean excluirNecessidade(Necessidade necessidade);
	Necessidade atualizarNecessidade(Necessidade necessidade);

}