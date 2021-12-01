package com.pds.doe.Controller.Adaptadores.Doacoes.Necessidade;
import com.pds.doe.Model.DominioDeNegocio.Doacoes.Necessidade.Necessidade;
import com.pds.doe.Model.Repositorios.NecessidadeRepositorio.IRepositorioNecessidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioNecessidades extends IRepositorioNecessidade, JpaRepository<Necessidade,Long> {
    @Query(value = "select * from necessidades where necessidades.item_id = :itemId", nativeQuery = true)
    Necessidade findNecessidadeExistsByItemId(Long itemId);
}
