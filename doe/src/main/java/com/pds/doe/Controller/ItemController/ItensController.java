package com.pds.doe.Controller.ItemController;

import com.pds.doe.View.CadastrarItem.ItemDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.Servicos.DTOs.ItemCadastroDTO;
import com.pds.doe.Model.Servicos.DTOs.ItemExistDTO;
import com.pds.doe.Model.Servicos.ItensServico.ItemServico;

@RestController
@RequestMapping("/itens")
public class ItensController {

	private ItemServico itemServico;

	@Autowired
	public ItensController(ItemServico itemServico) {
		this.itemServico = itemServico;
	}

	public boolean cadastrarItem(ItemDTO novoItem) {
		return false;
	}

	@GetMapping
	public Page<Item> getItens(
		@RequestParam(defaultValue = "0") int page,
		@RequestParam(defaultValue = "9") int size
	){
		Pageable paging = PageRequest.of(page, size);
		return this.itemServico.getItensPaginated(paging);
	}

	@GetMapping("/exists/{itemName}")
	public ItemExistDTO checkItemExistsByName(@PathVariable String itemName){
		return this.itemServico.checkItemExistsByName(itemName);
	}

	@PostMapping
	public Item createItem(@RequestBody ItemCadastroDTO itemDTO){
		return this.itemServico.createItem(itemDTO);
	}



}
