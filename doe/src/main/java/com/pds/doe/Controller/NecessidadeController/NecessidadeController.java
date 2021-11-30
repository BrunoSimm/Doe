package com.pds.doe.Controller.NecessidadeController;

import com.pds.doe.Model.Servicos.NecessidadeServico.NecessidadeServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/necessidades")
public class NecessidadeController {
	private NecessidadeServico necessidadeServico;

	@Autowired
	public NecessidadeController(NecessidadeServico necessidadeServico) {
		this.necessidadeServico = necessidadeServico;
	}

	public Necessidade adicionarNecessidade(ONG ong, Item item, int quantidade, int quantidade_atual, Date prazoLimite, String status) {
		return null;
	}

	public List<Item> listarItens() {
		return null;
	}

}
