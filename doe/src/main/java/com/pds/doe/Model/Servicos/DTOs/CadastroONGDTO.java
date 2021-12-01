package com.pds.doe.Model.Servicos.DTOs;

public class CadastroONGDTO {
    private String email;
    private String password;
    private String fullName;
    private String phone;
    private String finalidade;
    private String representante;
    private String registro;
    private String dominio;

    public CadastroONGDTO(String email, String password, String fullName, String phone, String finalidade,
            String representante, String registro, String dominio) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.finalidade = finalidade;
        this.representante = representante;
        this.registro = registro;
        this.dominio = dominio;
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
    public String getFinalidade() {
        return finalidade;
    }
    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }
    public String getRepresentante() {
        return representante;
    }
    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getDominio() {
        return dominio;
    }
    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
    
   
}
