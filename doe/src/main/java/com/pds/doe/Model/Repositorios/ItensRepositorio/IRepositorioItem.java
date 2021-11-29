package com.pds.doe.Model.Repositorios.ItensRepositorio;

import java.util.List;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.Repositorios.IRepositorio;

public interface IRepositorioItem extends IRepositorio<Item, String>{

	List<Item> findByChave(String chave);
    List<Item> findAll();

}
