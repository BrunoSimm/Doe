package com.pds.doe.Model.Repositorios.DoacoesRepositorio;

import com.pds.doe.Model.Repositorios.IRepositorio;

import java.util.List;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;

public interface ItensNecessidade extends IRepositorio<Necessidade, Integer> {

	List<Necessidade> findByChave(Integer chave);
    List<Necessidade> findfindAll();

}
