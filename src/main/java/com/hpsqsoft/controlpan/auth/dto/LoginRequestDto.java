package com.hpsqsoft.controlpan.auth.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String usuario;
    private String contrasena;
}
