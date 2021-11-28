package 02-Arquitetura.03-Pacotes.Model.Repositorios;

import java.util.Collection;

public interface IRepositorio {

	public abstract void create(E elemento);

	public abstract void update(E elemento);

	public abstract void delete(K chave);

	public abstract E read(K chave);

	public abstract Collection<E> todos();

	public abstract Collection<E> pesquisa(Predicate<E> pred);

}
