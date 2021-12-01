package com.pds.doe.Model.Servicos.DTOs;

public class ItemDTO {

	private String nome;

	private String descricao;

	private String imagem;

	public ItemDTO(String nome, String descricao, String imagem) {
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	

}
