package 02-Arquitetura.03-Pacotes.Model.Repositorios.UsuariosRepositorio;

import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.ONG.ONG;

public interface IRepositorioONG {

	private ONG[] oNG;

	public abstract void create(ONG ong);

	public abstract boolean consultaONGByRegistro(String registro);

}
