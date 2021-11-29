package com.pds.doe.Model.Servicos.DTOs;

public class CadastroONGDTO {
    private String email;
    private String senha;
    private String nome;
    private String telefone;
    private String finalidade;
    private String representante;
    private String registro;
    private String dominio;
    public CadastroONGDTO(String email, String senha, String nome, String telefone, String finalidade,
            String representante, String registro, String dominio) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.finalidade = finalidade;
        this.representante = representante;
        this.registro = registro;
        this.dominio = dominio;
    }
    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public String getRepresentante() {
        return representante;
    }

    public String getRegistro() {
        return registro;
    }

    public String getDominio() {
        return dominio;
    }
}
