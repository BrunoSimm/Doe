package com.pds.doe.Model.Repositorios;

import java.util.Collection;
import java.util.function.Predicate;

public interface IRepositorio<E, K> {
	void create(E elemento);
    void atualiza(E elemento);
    void remove(K chave);
    Collection<E> pesquisa(Predicate<E> pred);
    Collection<E> todos();
    E read(K chave);
}
