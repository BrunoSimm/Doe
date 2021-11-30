package com.pds.doe.Controller.Adaptadores.Doacoes.Necessidade;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;
import com.pds.doe.Model.Repositorios.NecessidadeRepositorio.IRepositorioNecessidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioNecessidades extends IRepositorioNecessidade, JpaRepository<Necessidade,Long> {
    
}
