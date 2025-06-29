package com.hpsqsoft.controlpan.auth.service;

import com.hpsqsoft.controlpan.auth.entity.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    List<Empleado> findAll();
    Optional<Empleado> findById(String id);
    Empleado save(Empleado empleado);
    void deleteById(String id);
}
