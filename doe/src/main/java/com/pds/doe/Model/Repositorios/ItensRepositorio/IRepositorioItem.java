package com.pds.doe.Model.Repositorios.ItensRepositorio;

import java.util.List;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;

public interface IRepositorioItem extends IRepositorio<Item, String>{

	List<Item> listaItens;
	private Item[] itens;
	private Item[] itens;
	private List<Item> list;
	public Item buscarItem();
	public abstract List<Item> buscarItens();
	public abstract Item buscarItemPorNome(String nome);
	public abstract void salvarItem(Item item);

}
