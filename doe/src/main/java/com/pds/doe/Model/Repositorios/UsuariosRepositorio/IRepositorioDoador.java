package com.pds.doe.Model.Repositorios.UsuariosRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;

public interface IRepositorioDoador {

	private Doador[] doador;

	public abstract void create(Doador doador);

	public abstract boolean consultaDoadorByCpf(String cpf);

	public abstract boolean consultaDoadorByEmail(String email);

}
