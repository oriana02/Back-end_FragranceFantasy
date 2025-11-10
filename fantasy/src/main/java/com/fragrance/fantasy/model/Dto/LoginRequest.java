package com.fragrance.fantasy.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//Representa la solicitud de inicio de sesión enviada desde el frontend
public class LoginRequest {

    private String email;
    private String password;

}
