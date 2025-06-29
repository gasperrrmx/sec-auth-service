package com.hpsqsoft.controlpan.auth.repository;

import com.hpsqsoft.controlpan.auth.entity.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, String> {
    List<UsuarioRol> findByIdUsuario(String idUsuario);
}
