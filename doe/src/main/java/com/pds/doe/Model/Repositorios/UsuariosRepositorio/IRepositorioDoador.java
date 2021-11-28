package 02-Arquitetura.03-Pacotes.Model.Repositorios.UsuariosRepositorio;

import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.Doador.Doador;

public interface IRepositorioDoador {

	private Doador[] doador;

	public abstract void create(Doador doador);

	public abstract boolean consultaDoadorByCpf(String cpf);

	public abstract boolean consultaDoadorByEmail(String email);

}
