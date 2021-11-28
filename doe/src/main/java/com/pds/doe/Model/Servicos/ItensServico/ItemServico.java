package 02-Arquitetura.03-Pacotes.Model.Servicos.ItensServico;

import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Doacoes.Item.Item;
import 02-Arquitetura.03-Pacotes.View.CadastrarItem.ItemDTO;
import 02-Arquitetura.03-Pacotes.Model.Repositorios.ItensRepositorio.IRepositorioItem;

public class ItemServico {

	private IRepositorioItem repositorioItens;

	private IRepositorioItem iRepositorioItem;

	public boolean validaDadosItem(ItemDTO item) {
		return false;
	}

	public void validaItemRepetido(String nomeItem) {

	}

}
