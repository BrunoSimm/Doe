package com.pds.doe.Model.Servicos.DTOs;

public class CadastroDoadorDTO {
    private String email;
    private String password;
    private String fullName;
    private String phone;
    private String sobrenome;
    private String cpf;
    
    public CadastroDoadorDTO(String email, String password, String fullName, String phone, String sobrenome,
            String cpf) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
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
    
    
}
