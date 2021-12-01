package com.pds.doe.Model.Servicos.ItensServico;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;
import com.pds.doe.Model.Repositorios.ItensRepositorio.IRepositorioItem;
import com.pds.doe.Model.Repositorios.NecessidadeRepositorio.IRepositorioNecessidade;
import java.util.List;

public class RealizaBusca {

	private IRepositorioItem itensDoacao;
	private IRepositorioNecessidade iRepositorioNecessidade;

	
	public RealizaBusca(IRepositorioItem itensDoacao, IRepositorioNecessidade iRepositorioNecessidade) {
		this.itensDoacao = itensDoacao;
		this.iRepositorioNecessidade = iRepositorioNecessidade;
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
