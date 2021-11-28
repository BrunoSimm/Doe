package 02-Arquitetura.03-Pacotes.Model.Servicos.NecessidadeServico;

import 02-Arquitetura.03-Pacotes.Model.Repositorios.NecessidadeRepositorio.IRepositorioNecessidade;
import 02-Arquitetura.03-Pacotes.Model.Repositorios.ItensRepositorio.IRepositorioItem;
import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Doacoes.Item.Item;
import java.util.Date;
import java.util.List;

public class NecessidadeServico {

	private IRepositorioNecessidade iRepositorioNecessidade;

	private IRepositorioItem iRepositorioItem;

	public boolean validaDadosNecessidade(Item item, int quantidade, int quantidade_atual, Date prazoLimite, String status) {
		return false;
	}

	public List<Item> listarItens() {
		return null;
	}

}
