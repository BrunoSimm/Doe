package 02-Arquitetura.03-Pacotes.Model.Servicos.CadastroServico;

import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.ONG.ONG;
import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.Doador.Doador;
import 02-Arquitetura.03-Pacotes.Model.Repositorios.UsuariosRepositorio.IRepositorioONG;
import 02-Arquitetura.03-Pacotes.Model.Repositorios.UsuariosRepositorio.IRepositorioDoador;

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
