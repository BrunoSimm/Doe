package com.pds.doe.Controller.Adaptadores.Doacoes.Item;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioItens extends JpaRepository<Item,Long> {
    Page<Item> findAll(Pageable pageable);
    Item save(Item item);
    Item findItemByNome(String nome);
}
