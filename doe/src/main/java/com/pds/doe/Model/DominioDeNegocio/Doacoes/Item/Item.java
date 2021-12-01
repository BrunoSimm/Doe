package com.pds.doe.Model.DominioDeNegocio.Doacoes.Item;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;

@Entity
@Table(name = "itens")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
	private String nome;
	
    @Column
    private String descricao;
	
    @Column(length = 10000)
    private String imagem;
	
    @Column
    private boolean ativo = false;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private List<Necessidade> necessidades;

	public Item(String nome, String descricao, String imagem, boolean ativo) {
		this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.ativo = ativo;
	}	

    public Item(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Necessidade> getNecessidades() {
        return necessidades;
    }

    public void setNecessidades(List<Necessidade> necessidades) {
        this.necessidades = necessidades;
    }

    public void makeActive() {
        this.ativo = true;
    }

    public void makeNotActive() {
        this.ativo = false;
    }

    @Override
    public String toString() {
        return "Item [ativo=" + ativo + ", descricao=" + descricao + ", id=" + id + ", imagem=" + imagem + ", nome="
                + nome + "]";
    }
}
