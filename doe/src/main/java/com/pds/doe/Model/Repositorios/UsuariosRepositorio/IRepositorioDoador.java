package com.pds.doe.Model.Repositorios.UsuariosRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;
import com.pds.doe.Model.Repositorios.IRepositorio;

public interface IRepositorioDoador<E, K> extends IRepositorio<E, K> {

	Doador[] doadores;

}
