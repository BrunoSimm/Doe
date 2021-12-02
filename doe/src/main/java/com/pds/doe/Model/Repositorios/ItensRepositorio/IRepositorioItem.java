package com.pds.doe.Model.Repositorios.ItensRepositorio;

import java.util.List;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;

public interface IRepositorioItem {

    Item buscarItemPorNome(String nome);
    void salvarItem(Item item);
    List<Item> buscarItens();
    Item buscarItem();

}
