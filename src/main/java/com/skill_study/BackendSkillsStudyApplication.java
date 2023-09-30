package com.skill_study;

import com.skill_study.entidades.Rol;
import com.skill_study.entidades.Usuario;
import com.skill_study.entidades.UsuarioRol;
import com.skill_study.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BackendSkillsStudyApplication implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    public static void main(String[] args) {
        SpringApplication.run(BackendSkillsStudyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
