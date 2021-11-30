package com.pds.doe.Model.Servicos.NecessidadeServico;

import com.pds.doe.Model.Repositorios.NecessidadeRepositorio.IRepositorioNecessidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pds.doe.Model.Repositorios.ItensRepositorio.IRepositorioItem;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import java.util.Date;
import java.util.List;

@Service
public class NecessidadeServico {

	private IRepositorioNecessidade iRepositorioNecessidade;
	private IRepositorioItem iRepositorioItem;

	@Autowired
	public NecessidadeServico(IRepositorioNecessidade iRepositorioNecessidade, IRepositorioItem iRepositorioItem) {
		this.iRepositorioNecessidade = iRepositorioNecessidade;
		this.iRepositorioItem = iRepositorioItem;
	}

	public boolean validaDadosNecessidade(Item item, int quantidade, int quantidade_atual, Date prazoLimite, String status) {
		return false;
	}

	public List<Item> listarItens() {
		return null;
	}

}
