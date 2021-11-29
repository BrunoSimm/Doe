package com.pds.doe.Model.Repositorios.NecessidadeRepositorio;

import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Item.Item;
import java.util.Date;

public interface IRepositorioNecessidade extends IRepositorio<E, K> {

	Necessidade[] necessidades;

}