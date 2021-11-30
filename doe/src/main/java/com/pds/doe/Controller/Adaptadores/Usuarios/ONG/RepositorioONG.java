package com.pds.doe.Controller.Adaptadores.Usuarios.ONG;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;
import com.pds.doe.Model.Repositorios.UsuariosRepositorio.IRepositorioONG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioONG extends IRepositorioONG, JpaRepository<ONG,Long> {
    
}
