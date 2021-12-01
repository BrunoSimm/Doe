package com.pds.doe.Model.Servicos.ItensServico;

import com.pds.doe.View.CadastrarItem.ItemDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.pds.doe.Controller.Adaptadores.Doacoes.Item.RepositorioItens;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.Servicos.DTOs.ItemCadastroDTO;
import com.pds.doe.Model.Servicos.DTOs.ItemExistDTO;

@Service
public class ItemServico {

	private RepositorioItens repositorioItens;
	
	@Autowired
	public ItemServico(RepositorioItens repositorioItens) {
		this.repositorioItens = repositorioItens;
	}

	public boolean validaDadosItem(ItemDTO item) {
		return false;
	}

	public void validaItemRepetido(String nomeItem) {

	}

    public Page<Item> getItensPaginated(Pageable pageable) {
        return this.repositorioItens.findAll(pageable);
    }

    public ItemExistDTO checkItemExistsByName(String itemName) {
		Item item = this.repositorioItens.findItemByNome(itemName);
		ItemExistDTO itemExistDTO = new ItemExistDTO(false);

		if(item == null){
			itemExistDTO.setExists(false); // Item não existe.
		} else itemExistDTO.setExists(true);

        return itemExistDTO;
    }

	public Item createItem(ItemCadastroDTO itemDTO) {
		return this.repositorioItens.save(new Item(itemDTO.getName(), itemDTO.getDescription(), itemDTO.getImage(), false));
	}
}
