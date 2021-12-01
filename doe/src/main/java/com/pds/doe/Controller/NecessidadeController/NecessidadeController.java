package com.pds.doe.Controller.NecessidadeController;

import com.pds.doe.Model.Servicos.DTOs.EntityExistDTO;
import com.pds.doe.Model.Servicos.DTOs.NecessidadeCadastroDTO;
import com.pds.doe.Model.Servicos.DTOs.NecessidadeDTO;
import com.pds.doe.Model.Servicos.NecessidadeServico.NecessidadeServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;

@RestController
@RequestMapping("/necessidades")
@CrossOrigin(originPatterns = "http://localhost:4200")
public class NecessidadeController {

	private NecessidadeServico necessidadeServico;

	@Autowired
	public NecessidadeController(NecessidadeServico necessidadeServico) {
		this.necessidadeServico = necessidadeServico;
	}

	@GetMapping
	public List<NecessidadeDTO> getNecessidades(
		@RequestParam(defaultValue = "0") int page,
		@RequestParam(defaultValue = "9") int size
	){
		Pageable paging = PageRequest.of(page, size);
		return this.necessidadeServico.getNecessidadePaginated(paging);
	}

	@GetMapping("/exists/{itemId}")
	public EntityExistDTO checkItemExistsByItemId(@PathVariable Long itemId){
		return necessidadeServico.checkNecessidadeExistsByItemId(itemId);
	}

	@PostMapping
	public ResponseEntity<Necessidade> createNecessidade(@RequestBody NecessidadeCadastroDTO necessidadeDTO){
		Necessidade necessidade = this.necessidadeServico.createNecessidade(necessidadeDTO);
		if(necessidade == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(necessidade);
	}

}
