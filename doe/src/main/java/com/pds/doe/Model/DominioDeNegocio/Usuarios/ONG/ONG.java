package com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;

public class ONG extends Usuario {

	private String finalidade;

	private String representante;

	private String registro;

	private String dominio;

	private {Ativa, Inativa, Bloqueada} estadoDaConta;

	public ONG ONG(String email, String senha, String nome, String telefone, String finalidade, String representante, String registro, String dominio, boolean contaAtiva) {
		return null;
	}

	public String getFinalidade() {
		return null;
	}

	public String getRepresentante() {
		return null;
	}

	public String getRegistro() {
		return null;
	}

	public String getDominio() {
		return null;
	}

	public {Ativa, Inativa, Bloqueada} getEstadoDaConta() {
		return null;
	}

	public void bloquearConta() {

	}

	public void desbloquearConta() {

	}

	public void ativarConta() {

	}

	public void deletarConta() {

	}

}
