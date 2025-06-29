package com.hpsqsoft.controlpan.auth.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sec_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @Column(name = "id_usuario", nullable = false, length = 36)
    private String idUsuario;

    @Column(name = "usuario", nullable = false, unique = true, length = 50)
    private String usuario;

    @Column(name = "contrasena", nullable = false, length = 255)
    private String contrasena;

    @Column(name = "estado", nullable = false)
    private Integer estado;

    @Column(name = "id_empleado", length = 36)
    private String idEmpleado;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
}
