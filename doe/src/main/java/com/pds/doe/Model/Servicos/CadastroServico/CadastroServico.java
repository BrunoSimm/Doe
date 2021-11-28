package com.pds.doe.Model.Servicos.CadastroServico;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;
import com.pds.doe.Model.Repositorios.UsuariosRepositorio.IRepositorioONG;
import com.pds.doe.Model.Repositorios.UsuariosRepositorio.IRepositorioDoador;

public class CadastroServico {

	private IRepositorioONG iRepositorioONG;

	private IRepositorioDoador iRepositorioDoador;

	public boolean consultaDoador(String email, String cpf) {
		return false;
	}

	public boolean consultaONG(String registro) {
		return false;
	}

	public boolean cadastrarUsuario(ONG ong) {
		return false;
	}

	public boolean cadastrarUsuario(Doador doador) {
		return false;
	}

	public boolean validaDadosCadastrados(ONG ong) {
		return false;
	}

	public boolean validaDadosCadastrados(Doador doador) {
		return false;
	}

}
