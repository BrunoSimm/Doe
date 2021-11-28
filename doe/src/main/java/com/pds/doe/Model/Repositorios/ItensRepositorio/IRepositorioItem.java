package 02-Arquitetura.03-Pacotes.Model.Repositorios.ItensRepositorio;

import java.util.List;
import 02-Arquitetura.03-Pacotes.Model.Dominio de Negocio.Doacoes.Item.Item;

public interface IRepositorioItem {

	private List<Item> listaItens;

	private Item[] item;

	private Item[] item;

	private List<Item> list;

	public Item buscarItem();

	public abstract List<Item> buscarItens();

	public abstract Item buscarItemPorNome(String nome);

	public abstract void salvarItem(Item item);

}
