package com.pds.doe.Model.Servicos.ItensServico;

import com.pds.doe.View.CadastrarItem.ItemDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pds.doe.Model.Repositorios.ItensRepositorio.IRepositorioItem;

@Service
public class ItemServico {

	private IRepositorioItem iRepositorioItem;
	
	@Autowired
	public ItemServico(IRepositorioItem iRepositorioItem) {
		this.iRepositorioItem = iRepositorioItem;
	}

	public boolean validaDadosItem(ItemDTO item) {
		return false;
	}

	public void validaItemRepetido(String nomeItem) {

	}

}
