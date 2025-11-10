package com.fragrance.fantasy.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// Es la respuesta que el backend devuelve después de una autenticación exitosa
public class AuthResponse {

    private String token;
    private String email;
    private String rol;
}
