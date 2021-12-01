package com.pds.doe.Model.Servicos.CadastroServico;

import com.pds.doe.Controller.Adaptadores.Usuarios.RepositorioUsuarios;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;
import com.pds.doe.Model.Servicos.DTOs.LoginDTO;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private RepositorioUsuarios repositorioUsuarios;

    public LoginService(RepositorioUsuarios repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    public Usuario validateLogin(LoginDTO loginDTO) {
        Usuario usuario = this.repositorioUsuarios.findByEmail(loginDTO.getEmail());
        if(usuario != null){
            if(usuario.getSenha().equals(loginDTO.getPassword())){
                return usuario;
            } else return null; //Senha errada.
        }

        return null; //Usuário não encontrado.
    }
}
