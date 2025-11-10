package com.fragrance.fantasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fragrance.fantasy.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
