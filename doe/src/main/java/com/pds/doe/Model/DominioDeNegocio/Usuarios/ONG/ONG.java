package com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;

@Entity
@Table(name = "ongs")
public class ONG extends Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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
	private EstadoDaConta estadoDaConta;

	public ONG(String email, String senha, String nome, String telefone, Long id, String finalidade,
			String representante, String registro, String dominio, EstadoDaConta estadoDaConta) {
		super(email, senha, nome, telefone);
		this.id = id;
		this.finalidade = finalidade;
		this.representante = representante;
		this.registro = registro;
		this.dominio = dominio;
		this.estadoDaConta = estadoDaConta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "ONG [dominio=" + dominio + ", estadoDaConta=" + estadoDaConta + ", finalidade=" + finalidade + ", id="
				+ id + ", registro=" + registro + ", representante=" + representante + "]";
	}

}
