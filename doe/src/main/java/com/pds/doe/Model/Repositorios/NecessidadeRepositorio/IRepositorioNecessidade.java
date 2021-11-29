package com.pds.doe.Model.Repositorios.NecessidadeRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;
import com.pds.doe.Model.Repositorios.IRepositorio;
import java.util.List;

public interface IRepositorioNecessidade extends IRepositorio<Necessidade, Integer> {
	
	List<Necessidade> findBychave(Integer chave);
    List<Necessidade> findfindAll();

}