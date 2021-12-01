package com.pds.doe.Model.Servicos.NecessidadeServico;

import com.pds.doe.Model.Servicos.DTOs.EntityExistDTO;
import com.pds.doe.Model.Servicos.DTOs.NecessidadeCadastroDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pds.doe.Controller.Adaptadores.Doacoes.Necessidade.RepositorioNecessidades;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;

@Service
public class NecessidadeServico {

	private RepositorioNecessidades repositorioNecessidades;

	@Autowired
	public NecessidadeServico(RepositorioNecessidades repositorioNecessidades) {
		this.repositorioNecessidades = repositorioNecessidades;
	}

    public Page<Necessidade> getNecessidadePaginated(Pageable paging) {
        return this.repositorioNecessidades.findAll(paging);
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
