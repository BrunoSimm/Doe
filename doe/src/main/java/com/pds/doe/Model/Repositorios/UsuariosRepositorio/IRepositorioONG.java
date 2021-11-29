package com.pds.doe.Model.Repositorios.UsuariosRepositorio;

import java.util.List;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Model.Repositorios.IRepositorio;

public interface IRepositorioONG extends IRepositorio<ONG, Long> {

	List<ONG> getONGfindByChave(Long chave);
    List<ONG> findAll();

}
