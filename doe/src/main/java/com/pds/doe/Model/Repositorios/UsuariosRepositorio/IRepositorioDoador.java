package com.pds.doe.Model.Repositorios.UsuariosRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;

public interface IRepositorioDoador {

    void create(Doador doador);
    boolean consultaDoadorByCpf(String cpf);
    boolean consultaDoadorByEmail(String email);

}
