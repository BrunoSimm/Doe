package 02-Arquitetura.03-Pacotes.Model.Repositorios.NecessidadeRepositorio;

import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Doacoes.Necessidade.Necessidade;
import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Doacoes.Item.Item;
import java.util.Date;

public interface IRepositorioNecessidade {

	private Necessidade[] necessidade;

	public abstract Necessidade salvarNecessidade(Item item, int quantidade_esperada, int quantidade_atual, Date prazoLimite, String status);

	public abstract boolean excluirNecessidade(Necessidade necessidade);

	public abstract Necessidade atualizarNecessidade(Necessidade necessidade);

}
