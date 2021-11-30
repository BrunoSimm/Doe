package com.pds.doe.Model.DominioDeNegocio.Doacoes.Item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itens")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
	private String nome;
	
    @Column
    private String descricao;
	
    @Column
    private String imagem;
	
    @Column()
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

    @Override
    public String toString() {
        return "Item [ativo=" + ativo + ", descricao=" + descricao + ", id=" + id + ", imagem=" + imagem + ", nome="
                + nome + "]";
    }
}
