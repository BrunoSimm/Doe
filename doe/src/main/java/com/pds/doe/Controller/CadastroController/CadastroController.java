package com.pds.doe.Controller.CadastroController;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;
import com.pds.doe.Model.Servicos.CadastroServico.CadastroServico;
import com.pds.doe.Model.Servicos.DTOs.CadastroDoadorDTO;
import com.pds.doe.Model.Servicos.DTOs.CadastroONGDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(originPatterns = "http://localhost:4200")
public class CadastroController {

	private CadastroServico cadastroServico;
	
	@Autowired
	public CadastroController(CadastroServico cadastroServico) {
		this.cadastroServico = cadastroServico;
	}

	@PostMapping("/ong")
	public ONG cadastrar(@RequestBody CadastroONGDTO cadastroONGDTO) {
		return cadastroServico.cadastrarONG(cadastroONGDTO);
	}

	@PostMapping("/doador")
	public Doador cadastrar(@RequestBody CadastroDoadorDTO cadastroDoadorDTO) {
		return cadastroServico.cadastrarDoador(cadastroDoadorDTO);
	}

}
