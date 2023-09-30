package com.skill_study.servicios;

import com.skill_study.entidades.Usuario;
import com.skill_study.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario (Usuario usuario, Set<UsuarioRol> usuarioRoles) throws  Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);

}
