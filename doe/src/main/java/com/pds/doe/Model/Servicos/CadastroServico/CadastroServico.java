package com.pds.doe.Model.Servicos.CadastroServico;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;
import com.pds.doe.Model.Repositorios.UsuariosRepositorio.IRepositorioONG;
import com.pds.doe.Model.Servicos.DTOs.CadastroDoadorDTO;
import com.pds.doe.Model.Servicos.DTOs.CadastroONGDTO;

import org.springframework.beans.factory.annotation.Autowired;

import com.pds.doe.Model.Repositorios.UsuariosRepositorio.IRepositorioDoador;

public class CadastroServico {

	@Autowired
	private IRepositorioONG iRepositorioONG;
	@Autowired
	private IRepositorioDoador iRepositorioDoador;

	public boolean consultaDoador(String email, String cpf) {
		return false;
	}

	public boolean consultaONG(String registro) {
		return false;
	}

	public boolean cadastrarUsuario(CadastroONGDTO ong) {
		// TODO: validar dados do DTO
		String email = ong.getEmail();
		String senha = ong.getSenha();
		String nome = ong.getNome();
		String telefone = ong.getTelefone();
		String finalidade = ong.getFinalidade();
		String representante = ong.getRepresentante();
		String registro = ong.getRegistro();
		String dominio = ong.getDominio();
		ONG ong = new ONG(email, senha, nome, telefone, finalidade, representante, registro, dominio);
		// iRepositorioONG.save(ong);
	}

	public boolean cadastrarUsuario(CadastroDoadorDTO doador) {
		// TODO: validar dados do DTO
		String email = doador.getEmail();
		String senha = doador.getSenha();
		String nome = doador.getNome();
		String telefone = doador.getTelefone();
		String sobrenome = doador.getSobrenome();
		String cpf = doador.getCpf();
		Doador doador = new Doador(email, senha, nome, telefone, sobrenome, cpf);
	}

	public boolean validaDadosCadastrados(ONG ong) {
		return false;
	}

	public boolean validaDadosCadastrados(Doador doador) {
		return false;
	}

}
