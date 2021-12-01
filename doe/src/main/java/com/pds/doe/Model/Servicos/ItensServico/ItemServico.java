package com.pds.doe.Model.Servicos.ItensServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.pds.doe.Controller.Adaptadores.Doacoes.Item.RepositorioItens;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.Servicos.DTOs.EntityExistDTO;
import com.pds.doe.Model.Servicos.DTOs.ItemCadastroDTO;
import com.pds.doe.Model.Servicos.DTOs.ItemDTO;

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

    public List<Item> getItensPaginated(Pageable pageable) {

		
		List<Item> itens = this.repositorioItens.findAll(pageable).toList();

		
        return itens;
    }

    public EntityExistDTO checkItemExistsByName(String itemName) {
		Item item = this.repositorioItens.findItemByNome(itemName);
		EntityExistDTO itemExistDTO = new EntityExistDTO();

		if(item == null){
			itemExistDTO.setExists(false); // Item não existe.
		} else itemExistDTO.setExists(true);

        return itemExistDTO;
    }

	public Item createItem(ItemCadastroDTO itemDTO) {
		if(this.repositorioItens.findItemByNome(itemDTO.getNome()) == null){
			return this.repositorioItens.save(new Item(itemDTO.getNome(), itemDTO.getDescricao(), itemDTO.getImagem(), false));
		}
		return null;
	}
}
