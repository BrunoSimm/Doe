package com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;

public class Doador extends Usuario {

	private String sobrenome;
	private String cpf;
	private boolean contaAtiva;

	public Doador(String email, String senha, String nome, String telefone, String sobrenome, String cpf) {
		super(email, senha, nome, telefone);
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.contaAtiva = true;
	}

    public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean isContaAtiva() {
		return contaAtiva;
	}

	public void setContaAtiva(boolean contaAtiva) {
		this.contaAtiva = contaAtiva;
	}

}
