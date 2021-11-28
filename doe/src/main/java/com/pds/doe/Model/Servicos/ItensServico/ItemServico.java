package com.pds.doe.Model.Servicos.ItensServico;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.View.CadastrarItem.ItemDTO;
import com.pds.doe.Model.Repositorios.ItensRepositorio.IRepositorioItem;

public class ItemServico {

	private IRepositorioItem repositorioItens;

	private IRepositorioItem iRepositorioItem;

	public boolean validaDadosItem(ItemDTO item) {
		return false;
	}

	public void validaItemRepetido(String nomeItem) {

	}

}
