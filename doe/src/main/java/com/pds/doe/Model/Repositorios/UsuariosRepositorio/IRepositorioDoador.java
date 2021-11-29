package com.pds.doe.Model.Repositorios.UsuariosRepositorio;

import java.util.List;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;
import com.pds.doe.Model.Repositorios.IRepositorio;

public interface IRepositorioDoador extends IRepositorio<Usuario, Integer> {

	List<Doador> getDoadorfindByChave(Integer id);
    List<Doador> findAll();

}
