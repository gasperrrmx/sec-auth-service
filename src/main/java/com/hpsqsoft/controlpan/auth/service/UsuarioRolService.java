package com.hpsqsoft.controlpan.auth.service;

import com.hpsqsoft.controlpan.auth.entity.UsuarioRol;

import java.util.List;
import java.util.Optional;

public interface UsuarioRolService {
    List<UsuarioRol> findAll();
    Optional<UsuarioRol> findById(String id);
    UsuarioRol save(UsuarioRol usuarioRol);
    void deleteById(String id);
}
