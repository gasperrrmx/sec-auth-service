package com.hpsqsoft.controlpan.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponseDto {
    private String mensaje;
    private boolean exito;
}
