package com.hpsqsoft.controlpan.auth.service;

import com.hpsqsoft.controlpan.auth.entity.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(String id);
    Optional<Usuario> findByUsuario(String usuario);
    Usuario save(Usuario usuario);
    void deleteById(String id);
}
