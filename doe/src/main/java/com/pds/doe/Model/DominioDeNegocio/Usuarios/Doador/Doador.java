package com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;

@Entity
@Table(name = "doadores")
public class Doador extends Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String sobrenome;
	
	@Column
	private String cpf;
	
	@Column
	private boolean contaAtiva;

	public Doador(String email, String senha, String nome, String telefone, Long id, String sobrenome, String cpf,
			boolean contaAtiva) {
		super(email, senha, nome, telefone);
		this.id = id;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.contaAtiva = contaAtiva;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isContaAtiva() {
		return contaAtiva;
	}

	public void setContaAtiva(boolean contaAtiva) {
		this.contaAtiva = contaAtiva;
	}

	@Override
	public String toString() {
		return "Doador [contaAtiva=" + contaAtiva + ", cpf=" + cpf + ", id=" + id + ", sobrenome=" + sobrenome + "]";
	}

}
