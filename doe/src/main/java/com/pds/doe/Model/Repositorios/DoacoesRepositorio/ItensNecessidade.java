package com.pds.doe.Model.Repositorios.DoacoesRepositorio;

import com.pds.doe.Model.Repositorios.IRepositorio;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;

public interface ItensNecessidade extends IRepositorio<E, K> {

	Necessidade[] necessidades;

}
