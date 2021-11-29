package com.pds.doe.Controller.CadastroController;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;
import com.pds.doe.Model.Servicos.CadastroServico.CadastroServico;
import com.pds.doe.Model.Servicos.DTOs.CadastroDoadorDTO;
import com.pds.doe.Model.Servicos.DTOs.CadastroONGDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

	@Autowired
	private CadastroServico cadastroServico;

	@PostMapping("/ong")
	public boolean cadastrar(@RequestBody CadastroONGDTO cadastroONGDTO) {
		return cadastroServico.cadastrarUsuario(cadastroONGDTO);
	}

	@PostMapping("/doador")
	public boolean cadastrar(@RequestBody CadastroDoadorDTO cadastroDoadorDTO) {
		return cadastroServico.cadastrarUsuario(cadastroDoadorDTO);
	}

}
