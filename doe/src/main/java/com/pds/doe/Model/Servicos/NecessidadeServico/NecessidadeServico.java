package com.pds.doe.Model.Servicos.NecessidadeServico;

import com.pds.doe.Model.Repositorios.NecessidadeRepositorio.IRepositorioNecessidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pds.doe.Model.Repositorios.ItensRepositorio.IRepositorioItem;
import com.pds.doe.Controller.Adaptadores.Doacoes.Item.RepositorioItens;
import com.pds.doe.Controller.Adaptadores.Doacoes.Necessidade.RepositorioNecessidades;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import java.util.Date;
import java.util.List;

@Service
public class NecessidadeServico {

	private RepositorioNecessidades repositorioNecessidades;
	private RepositorioItens repositorioItens;

	@Autowired
	public NecessidadeServico(RepositorioNecessidades repositorioNecessidades, RepositorioItens repositorioItens) {
		this.repositorioNecessidades = repositorioNecessidades;
		this.repositorioItens = repositorioItens;
	}

	public boolean validaDadosNecessidade(Item item, int quantidade, int quantidade_atual, Date prazoLimite, String status) {
		return false;
	}

	public List<Item> listarItens() {
		return null;
	}

}
