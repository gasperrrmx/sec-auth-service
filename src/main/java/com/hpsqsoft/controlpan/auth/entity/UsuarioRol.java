package com.hpsqsoft.controlpan.auth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sec_usuario_rol", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"id_usuario", "id_rol"})
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioRol {

    @Id
    @Column(name = "id_usuario_rol", nullable = false, length = 36)
    private String id;

    @Column(name = "id_usuario", nullable = false, length = 36)
    private String idUsuario;

    @Column(name = "id_rol", nullable = false, length = 36)
    private String idRol;
}
