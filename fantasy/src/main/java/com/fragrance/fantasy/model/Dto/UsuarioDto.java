package com.fragrance.fantasy.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDto {

    private String nombre;
    private String apellido;
    private String email;
    private String rol;

}
