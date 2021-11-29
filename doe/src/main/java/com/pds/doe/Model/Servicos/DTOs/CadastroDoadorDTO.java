package com.pds.doe.Model.Servicos.DTOs;

public class CadastroDoadorDTO {
    private String email;
    private String senha;
    private String nome;
    private String telefone;
    private String sobrenome;
    private String cpf;
    
    public CadastroDoadorDTO(String email, String senha, String nome, String telefone, String sobrenome, String cpf) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
}
