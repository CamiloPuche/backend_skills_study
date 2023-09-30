package com.skill_study.repositorios;

import com.skill_study.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername (String username);

    void deleteById(Long usuarioId);
}
