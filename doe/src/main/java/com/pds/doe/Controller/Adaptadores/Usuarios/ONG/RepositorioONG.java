package com.pds.doe.Controller.Adaptadores.Usuarios.ONG;
import com.pds.doe.Model.DominioDeNegocio.Usuarios.ONG.ONG;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioONG extends JpaRepository<ONG,Long> {
    
}
