package com.hpsqsoft.controlpan.auth.repository;

import com.hpsqsoft.controlpan.auth.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
}
