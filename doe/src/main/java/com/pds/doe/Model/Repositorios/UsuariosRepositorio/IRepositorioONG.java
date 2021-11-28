package com.pds.doe.Model.Repositorios.UsuariosRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;

public interface IRepositorioONG {

	private ONG[] oNG;

	public abstract void create(ONG ong);

	public abstract boolean consultaONGByRegistro(String registro);

}
