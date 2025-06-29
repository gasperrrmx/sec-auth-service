package com.hpsqsoft.controlpan.auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sec_rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rol {

    @Id
    @Column(name = "id_rol", nullable = false, length = 36)
    private String id;

    @Column(name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "estado")
    private Integer estado;
}
