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
	private RepositorioONG repositorioONG;
	private RepositorioDoador repositorioDoador;

	@Autowired
	public CadastroServico(RepositorioONG repositorioONG, RepositorioDoador repositorioDoador) {
		this.repositorioONG = repositorioONG;
		this.repositorioDoador = repositorioDoador;
	}

	public boolean consultaDoador(String email, String cpf) {
		return false;
	}

	public boolean consultaONG(String registro) {
		return false;
	}

	public ONG cadastrarONG(CadastroONGDTO ongDTO) {
		// TODO: validar dados do DTO
		//BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		ONG ong = new ONG(
			null,
			ongDTO.getEmail(), 
			ongDTO.getPassword(), 
			ongDTO.getFullName(), 
			ongDTO.getPhone(), 
			ongDTO.getFinalidade(), 
			ongDTO.getRepresentante(), 
			ongDTO.getRegistro(), 
			ongDTO.getDominio(), 
			EstadoDaConta.Inativa
		);
		return this.repositorioONG.save(ong);
	}

	public Doador cadastrarDoador(CadastroDoadorDTO doadorDTO) {
		// TODO: validar dados do DTO
		Doador doador = new Doador(
			null,
			doadorDTO.getEmail(), 
			doadorDTO.getPassword(), 
			doadorDTO.getFullName(), 
			doadorDTO.getPhone(), 
			doadorDTO.getSobrenome(), 
			doadorDTO.getCpf(), 
			true
		);
		return this.repositorioDoador.save(doador);
	}

	public boolean validaDadosCadastrados(ONG ong) {
		return false;
	}

	public boolean validaDadosCadastrados(Doador doador) {
		return false;
	}

}
