package com.pds.doe.Model.DominioDeNegocio.Usuarios;

public class Usuario {

	private String email;
	private String senha;
	private String nome;
	private String telefone;

	public Usuario(String email, String senha, String nome, String telefone)
	{
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

}
