package com.pds.doe.Controller.Adaptadores.Doacoes.Item;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import com.pds.doe.Model.Repositorios.ItensRepositorio.IRepositorioItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioItens extends IRepositorioItem, JpaRepository<Item,Long> {
    
}
