package com.pds.doe.Model.Repositorios.UsuariosRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Model.Repositorios.IRepositorio;

public interface IRepositorioONG extends IRepositorio<E, K> {

	ONG[] ONGs;

}
