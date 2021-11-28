package 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.Doador;

import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.Usuario;

public class Doador extends Usuario {

	private String sobrenome;

	private String cpf;

	private boolean contaAtiva;

	public void Doador(String email, String senha, String nome, String telefone, String sobrenome, String cpf, boolean contaAtiva) {

	}

	public String getSobrenome() {
		return null;
	}

	public String getCpf() {
		return null;
	}

	public boolean isContaAtiva() {
		return false;
	}

	public void setContaAtiva() {

	}

}
