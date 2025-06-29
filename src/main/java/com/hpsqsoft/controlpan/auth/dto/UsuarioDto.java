package com.hpsqsoft.controlpan.auth.dto;

import lombok.Data;

@Data
public class UsuarioDto {
    private String idUsuario;
    private String usuario;
    private String correo;
    private String nombreEmpleado;
    private String rol;
    private boolean estado;
}
