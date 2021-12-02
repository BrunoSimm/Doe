package com.pds.doe.Model.Repositorios.UsuariosRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;

public interface IRepositorioONG {
	
    void create(ONG ong);
    boolean consultaONGByRegistro(String registro);

}
