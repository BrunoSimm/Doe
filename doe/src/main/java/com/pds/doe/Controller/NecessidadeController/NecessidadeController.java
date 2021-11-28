package 02-Arquitetura.03-Pacotes.Controller.NecessidadeController;

import 02-Arquitetura.03-Pacotes.Model.Servicos.NecessidadeServico.NecessidadeServico;
import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Doacoes.Necessidade.Necessidade;
import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Usuarios.ONG.ONG;
import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Doacoes.Item.Item;
import java.util.Date;
import java.util.List;

public class NecessidadeController {

	private NecessidadeServico necessidadeServico;

	public Necessidade adicionarNecessidade(ONG ong, Item item, int quantidade, int quantidade_atual, Date prazoLimite, String status) {
		return null;
	}

	public List<Item> listarItens() {
		return null;
	}

}
