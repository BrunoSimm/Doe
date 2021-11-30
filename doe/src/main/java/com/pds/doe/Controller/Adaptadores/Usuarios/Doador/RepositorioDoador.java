package com.pds.doe.Controller.Adaptadores.Usuarios.Doador;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Doador.Doador;
import com.pds.doe.Model.Repositorios.UsuariosRepositorio.IRepositorioDoador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDoador extends IRepositorioDoador, JpaRepository<Doador,Long> {
    
}
