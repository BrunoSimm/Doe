package com.pds.doe.Model.DominioDeNegocio.Doacoes.Item;

public class Item {
    private String nome;
    private String descricao;
    private int imagemId;
    private Boolean ativo;


    public Item(String nome, String descricao, int imagemId, Boolean ativo) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagemId = imagemId;
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

    public int getImagemId() {
        return this.imagemId;
    }

    public void setImagemId(int imagemId) {
        this.imagemId = imagemId;
    }
    
    public Boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
