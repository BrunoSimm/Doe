package com.pds.doe.Model.Servicos.DTOs;

import java.util.Date;

public class NecessidadeDTO {

	private String name;

	private String description;

	private String image;

	private boolean active;

	private Long idItem;

	private Long id;
    private int quantidade_esperada;
    private int quantidade_atual;
    private Date prazoLimite;
    private String status;
	
	public NecessidadeDTO(String name, String description, String image, boolean active, Long idItem, Long id,
			int quantidade_esperada, int quantidade_atual, Date prazoLimite, String status) {
		this.name = name;
		this.description = description;
		this.image = image;
		this.active = active;
		this.idItem = idItem;
		this.id = id;
		this.quantidade_esperada = quantidade_esperada;
		this.quantidade_atual = quantidade_atual;
		this.prazoLimite = prazoLimite;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantidade_esperada() {
		return quantidade_esperada;
	}

	public void setQuantidade_esperada(int quantidade_esperada) {
		this.quantidade_esperada = quantidade_esperada;
	}

	public int getQuantidade_atual() {
		return quantidade_atual;
	}

	public void setQuantidade_atual(int quantidade_atual) {
		this.quantidade_atual = quantidade_atual;
	}

	public Date getPrazoLimite() {
		return prazoLimite;
	}

	public void setPrazoLimite(Date prazoLimite) {
		this.prazoLimite = prazoLimite;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	

}
