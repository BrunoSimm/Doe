package com.pds.doe.Model.DominioDeNegocio.Doacoes.Item;

public class Item {

	private String nome;
	private String descricao;
	private String imagem;
	private boolean ativo = false;

	public Item(String nome, String descricao, String imagem, boolean ativo) {
		this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.ativo = ativo;
	}	

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagemId(String imagem) {
        this.imagem = imagem;
    }
    
    public Boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
