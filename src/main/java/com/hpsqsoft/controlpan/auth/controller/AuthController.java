package com.hpsqsoft.controlpan.auth.controller;

import com.hpsqsoft.controlpan.auth.dto.LoginRequestDto;
import com.hpsqsoft.controlpan.auth.dto.LoginResponseDto;
import com.hpsqsoft.controlpan.auth.dto.RegistroUsuarioDto;
import com.hpsqsoft.controlpan.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<LoginResponseDto> register(@RequestBody RegistroUsuarioDto request) {
        return ResponseEntity.ok(authService.registrar(request));
    }
}
