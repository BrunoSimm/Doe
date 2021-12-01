package com.pds.doe.Model.Servicos.ItensServico;

import java.util.List;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;
import com.pds.doe.Model.Repositorios.ItensRepositorio.IRepositorioItem;
import com.pds.doe.Model.Repositorios.NecessidadeRepositorio.IRepositorioNecessidade;

public class RealizaBusca {

	private IRepositorioItem repositorioItens;
	private IRepositorioNecessidade repositorioNecessidade;

	public RealizaBusca(IRepositorioItem repositorioItens, IRepositorioNecessidade repositorioNecessidade) {
		this.repositorioItens = repositorioItens;
		this.repositorioNecessidade = repositorioNecessidade;
	}

	public List<Item> BuscaPorNomeItem(Usuario usuario, String busca) {
		return null;
	}

	public List<Item> BuscaPorDescricaoItem(Usuario usuario, String busca) {
		return null;
	}

	public List<Item> ListaCompleta(Usuario usuario) {
		return null;
	}

}
