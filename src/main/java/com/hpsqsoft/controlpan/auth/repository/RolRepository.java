package com.hpsqsoft.controlpan.auth.repository;

import com.hpsqsoft.controlpan.auth.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, String> {
}
