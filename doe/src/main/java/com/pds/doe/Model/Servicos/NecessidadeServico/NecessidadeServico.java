package com.pds.doe.Model.Servicos.NecessidadeServico;

import com.pds.doe.Model.Servicos.DTOs.EntityExistDTO;
import com.pds.doe.Model.Servicos.DTOs.NecessidadeCadastroDTO;
import com.pds.doe.Model.Servicos.DTOs.NecessidadeDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.pds.doe.Controller.Adaptadores.Doacoes.Item.RepositorioItens;
import com.pds.doe.Controller.Adaptadores.Doacoes.Necessidade.RepositorioNecessidades;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;

@Service
public class NecessidadeServico {

	private RepositorioNecessidades repositorioNecessidades;
	private RepositorioItens repositorioItens;

	@Autowired
	public NecessidadeServico(RepositorioNecessidades repositorioNecessidades, RepositorioItens repositorioItens) {
		this.repositorioNecessidades = repositorioNecessidades;
		this.repositorioItens = repositorioItens;
	}

    public List<NecessidadeDTO> getNecessidadePaginated(Pageable paging) {
		List<NecessidadeDTO> necessidadesDTO = new ArrayList<NecessidadeDTO>();
		List<Necessidade> necessidades = this.repositorioNecessidades.findAll(paging).toList();

		for (Necessidade necessidade : necessidades) {
			Item item = this.repositorioItens.getById(necessidade.getItem_id());
			necessidadesDTO.add(
				new NecessidadeDTO(
					item.getNome(), 
					item.getDescricao(), 
					item.getImagem(), 
					item.isAtivo(), 
					item.getId(), 
					necessidade.getId(), 
					necessidade.getQuantidade_esperada(), 
					necessidade.getQuantidade_atual(), 
					necessidade.getPrazoLimite(), 
					necessidade.getStatus()
				)
			);
		}
        return necessidadesDTO;
    }

	public EntityExistDTO checkNecessidadeExistsByItemId(Long itemId) {
		Necessidade necessidade = this.repositorioNecessidades.findNecessidadeExistsByItemId(itemId);
		EntityExistDTO necessidadeExistDTO = new EntityExistDTO();

		if(necessidade == null){
			necessidadeExistDTO.setExists(false); // necessidade não existe.
		} else necessidadeExistDTO.setExists(true);

        return necessidadeExistDTO;
	}

    public Necessidade createNecessidade(NecessidadeCadastroDTO necessidadeDTO) {
        if(this.checkNecessidadeExistsByItemId(necessidadeDTO.getIdItem()).getExists() == true){
			return null;
		}
		return this.repositorioNecessidades.save(
			new Necessidade(null, necessidadeDTO.getExpectedQuantity(), necessidadeDTO.getCurrentQuantity(), necessidadeDTO.getlimitDate(), necessidadeDTO.getStatus(), necessidadeDTO.getIdItem())
		);
    }

}
