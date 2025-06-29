package com.hpsqsoft.controlpan.auth.service;

import com.hpsqsoft.controlpan.auth.entity.UsuarioRol;
import com.hpsqsoft.controlpan.auth.repository.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioRolServiceImpl implements UsuarioRolService {

    private final UsuarioRolRepository usuarioRolRepository;

    @Autowired
    public UsuarioRolServiceImpl(UsuarioRolRepository usuarioRolRepository) {
        this.usuarioRolRepository = usuarioRolRepository;
    }

    @Override
    public List<UsuarioRol> findAll() {
        return usuarioRolRepository.findAll();
    }

    @Override
    public Optional<UsuarioRol> findById(String id) {
        return usuarioRolRepository.findById(id);
    }

    @Override
    public UsuarioRol save(UsuarioRol usuarioRol) {
        return usuarioRolRepository.save(usuarioRol);
    }

    @Override
    public void deleteById(String id) {
        usuarioRolRepository.deleteById(id);
    }
}
