package com.pds.doe.Controller.Adaptadores.Usuarios.Doador;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDoador extends JpaRepository<Doador,Long> {
    
}
