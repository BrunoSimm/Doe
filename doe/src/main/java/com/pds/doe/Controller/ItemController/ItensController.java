package com.pds.doe.Controller.ItemController;

import java.util.List;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.Servicos.DTOs.EntityExistDTO;
import com.pds.doe.Model.Servicos.DTOs.ItemCadastroDTO;
import com.pds.doe.Model.Servicos.ItensServico.ItemServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itens")
@CrossOrigin(originPatterns = "http://localhost:4200")
public class ItensController {

	private ItemServico itemServico;

	@Autowired
	public ItensController(ItemServico itemServico) {
		this.itemServico = itemServico;
	}

	@GetMapping
	public List<Item> getItens(
		@RequestParam(defaultValue = "0") int page,
		@RequestParam(defaultValue = "9") int size
	){
		Pageable paging = PageRequest.of(page, size);
		return this.itemServico.getItensPaginated(paging);
	}

	@GetMapping("/exists/{itemName}")
	public EntityExistDTO checkItemExistsByName(@PathVariable String itemName){
		return this.itemServico.checkItemExistsByName(itemName);
	}

	@PostMapping
	public ResponseEntity<Item> createItem(@RequestBody ItemCadastroDTO itemDTO){
		Item item = this.itemServico.createItem(itemDTO);
		if(item == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(item);
	}

	public List<Item> index(int tipoUsuario) {
		return null;
	}

	public Item detalhes(int item_id) {
		return null;
	}
}
