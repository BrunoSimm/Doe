package com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "doadores")
public class Doador extends Usuario {

	@Column
	private String sobrenome;
	
	@Column
	@CPF
	private String cpf;
	
	@Column
	private boolean contaAtiva;

	public Doador(Long user_id, @Email String email, @NotBlank String senha, @NotBlank String nome,
			@NotBlank String telefone, String sobrenome, @CPF String cpf, boolean contaAtiva) {
		super(user_id, email, senha, nome, telefone);
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.contaAtiva = contaAtiva;
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
		return "Doador [contaAtiva=" + contaAtiva + ", cpf=" + cpf + ", id=" + ", sobrenome=" + sobrenome + "]";
	}

}
