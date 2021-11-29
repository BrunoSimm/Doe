package com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;

public class ONG extends Usuario {
	private String finalidade;
	private String representante;
	private String registro;
	private String dominio;
	private EstadoDaConta estadoDaConta;

	public ONG(String email, String senha, String nome, String telefone,
		String finalidade, String representante, String registro, String dominio) {
		super(email, senha, nome, telefone);
		this.finalidade = finalidade;
		this.representante = representante;
		this.registro = registro;
		this.dominio = dominio;
		this.estadoDaConta = EstadoDaConta.Inativa;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public String getRepresentante() {
		return representante;
	}

	public String getRegistro() {
		return registro;
	}

	public String getDominio() {
		return dominio;
	}

	public EstadoDaConta getEstadoDaConta() {
		return estadoDaConta;
	}

	public void bloquearConta() {
		this.estadoDaConta = EstadoDaConta.Bloqueada;
	}

	public void desbloquearConta() {
		this.estadoDaConta = EstadoDaConta.Ativa;
	}

	public void ativarConta() {
		this.estadoDaConta = EstadoDaConta.Ativa;
	}

}
