package com.pds.doe.Model.Repositorios.ItensRepositorio;

import java.util.List;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;

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
