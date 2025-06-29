package com.hpsqsoft.controlpan.auth.dto;

import lombok.Data;

@Data
public class RegistroUsuarioDto {
    private String usuario;
    private String contrasena;
    private String idEmpleado;
    private String idRol;
}
