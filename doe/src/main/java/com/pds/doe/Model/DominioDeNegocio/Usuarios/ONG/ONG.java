package com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;

@Entity
@Table(name = "ongs")
public class ONG extends Usuario {

	@Column
	private String finalidade;
	
	@Column
	private String representante;
	
	@Column
	private String registro;
	
	@Column
	private String dominio;
	
	@Enumerated(EnumType.STRING)
	@Column
	private EstadoDaConta estadoDaConta = EstadoDaConta.Inativa;

	public ONG(Long user_id, @Email String email, @NotBlank String senha, @NotBlank String nome,
			@NotBlank String telefone, String finalidade, String representante, String registro,
			String dominio, EstadoDaConta estadoDaConta) {
		super(user_id, email, senha, nome, telefone);
		this.finalidade = finalidade;
		this.representante = representante;
		this.registro = registro;
		this.dominio = dominio;
		this.estadoDaConta = estadoDaConta;
	}

	public ONG(){
		
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public EstadoDaConta getEstadoDaConta() {
		return estadoDaConta;
	}

	public void setEstadoDaConta(EstadoDaConta estadoDaConta) {
		this.estadoDaConta = estadoDaConta;
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

	@Override
	public String toString() {
		return "ONG [dominio=" + dominio + ", estadoDaConta=" + estadoDaConta + ", finalidade=" + finalidade + ", id="
				+ ", registro=" + registro + ", representante=" + representante + "]";
	}

}
