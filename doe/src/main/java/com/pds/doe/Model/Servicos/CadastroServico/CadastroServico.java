package com.pds.doe.Model.Servicos.CadastroServico;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.EstadoDaConta;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Controller.Adaptadores.Usuarios.Doador.RepositorioDoador;
import com.pds.doe.Controller.Adaptadores.Usuarios.ONG.RepositorioONG;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;
import com.pds.doe.Model.Servicos.DTOs.CadastroDoadorDTO;
import com.pds.doe.Model.Servicos.DTOs.CadastroONGDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroServico {
	private RepositorioONG iRepositorioONG;
	private RepositorioDoador iRepositorioDoador;

	@Autowired
	public CadastroServico(RepositorioONG iRepositorioONG, RepositorioDoador iRepositorioDoador) {
		this.iRepositorioONG = iRepositorioONG;
		this.iRepositorioDoador = iRepositorioDoador;
	}

	public boolean consultaDoador(String email, String cpf) {
		return false;
	}

	public boolean consultaONG(String registro) {
		return false;
	}

	public ONG cadastrarONG(CadastroONGDTO ongDTO) {
		// TODO: validar dados do DTO
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		ONG ong = new ONG(
			null,
			ongDTO.getEmail(), 
			ongDTO.getSenha(), 
			ongDTO.getNome(), 
			ongDTO.getTelefone(), 
			ongDTO.getFinalidade(), 
			ongDTO.getRepresentante(), 
			ongDTO.getRegistro(), 
			ongDTO.getDominio(), 
			EstadoDaConta.Inativa
		);
		return this.iRepositorioONG.save(ong);
	}

	public Doador cadastrarDoador(CadastroDoadorDTO doadorDTO) {
		// TODO: validar dados do DTO
		Doador doador = new Doador(
			null,
			doadorDTO.getEmail(), 
			doadorDTO.getSenha(), 
			doadorDTO.getNome(), 
			doadorDTO.getTelefone(), 
			doadorDTO.getSobrenome(), 
			doadorDTO.getCpf(), 
			true
		);
		return this.iRepositorioDoador.save(doador);
	}

	public boolean validaDadosCadastrados(ONG ong) {
		return false;
	}

	public boolean validaDadosCadastrados(Doador doador) {
		return false;
	}

}
