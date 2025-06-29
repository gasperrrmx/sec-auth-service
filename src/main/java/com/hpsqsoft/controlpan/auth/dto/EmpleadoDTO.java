package com.hpsqsoft.controlpan.auth.dto;

import lombok.Data;

@Data
public class EmpleadoDTO {
    private String idEmpleado;
    private String nombre;
    private String rfc;
    private String correo;
    private String telefono;
    private String direccion;
    private Integer estado;
    private String fechaIngreso;
}
