package 02-Arquitetura.03-Pacotes.Controller.CadastroController;

import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.ONG.ONG;
import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.Doador.Doador;
import 02-Arquitetura.03-Pacotes.Model.Servicos.CadastroServico.CadastroServico;

public class CadastroController {

	private CadastroServico cadastroServico;

	public boolean cadastrar(String email, String senha, String nome, String telefone, String finalidade, String representante, String registro, String dominio, boolean contaAtiva) {
		return false;
	}

	public boolean cadastrar(String email, String senha, String nome, String telefone, String sobrenome, String cpf, boolean contaAtiva) {
		return false;
	}

}
