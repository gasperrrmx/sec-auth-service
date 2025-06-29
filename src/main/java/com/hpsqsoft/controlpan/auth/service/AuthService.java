package com.hpsqsoft.controlpan.auth.service;

import com.hpsqsoft.controlpan.auth.dto.LoginRequestDto;
import com.hpsqsoft.controlpan.auth.dto.LoginResponseDto;
import com.hpsqsoft.controlpan.auth.dto.RegistroUsuarioDto;
import com.hpsqsoft.controlpan.auth.entity.Usuario;
import com.hpsqsoft.controlpan.auth.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    public LoginResponseDto login(LoginRequestDto request) {
        return usuarioRepository.findByUsuario(request.getUsuario())
                .map(user -> {
                    if (BCrypt.checkpw(request.getContrasena(), user.getContrasena())) {
                        return new LoginResponseDto("Acceso exitoso", true);
                    } else {
                        return new LoginResponseDto("Contraseña incorrecta", false);
                    }
                })
                .orElse(new LoginResponseDto("Usuario no encontrado", false));
    }

    public String registrar2(RegistroUsuarioDto request) {
        // Lógica básica para evitar null
        if (request.getUsuario() == null || request.getContrasena() == null) {
            return "Datos incompletos";
        }

        if (usuarioRepository.existsByUsuario(request.getUsuario())) {
            return "Usuario ya existe";
        }

        Usuario nuevo = new Usuario();
        nuevo.setIdUsuario(java.util.UUID.randomUUID().toString());
        nuevo.setUsuario(request.getUsuario());
        nuevo.setContrasena(BCrypt.hashpw(request.getContrasena(), BCrypt.gensalt()));
        nuevo.setEstado(1);
        usuarioRepository.save(nuevo);
        return "Usuario registrado correctamente";
    }
    
    public LoginResponseDto registrar(RegistroUsuarioDto request) {
        // ejemplo simple, ajusta según tu lógica real
        Usuario nuevo = new Usuario();
        nuevo.setIdUsuario(UUID.randomUUID().toString());
        nuevo.setUsuario(request.getUsuario());
        nuevo.setContrasena(passwordEncoder.encode(request.getContrasena()));
        nuevo.setEstado(1);

        // Relacionar empleado y roles si corresponde

        usuarioRepository.save(nuevo);

        return new LoginResponseDto("Registro exitoso", true);
    }
}
