package com.pds.doe.Controller.Adaptadores.Usuarios;

import com.pds.doe.Model.DominioDeNegocio.Usuarios.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuarios extends JpaRepository<Usuario,Long> {

    Usuario findByEmail(String email);
    
}
