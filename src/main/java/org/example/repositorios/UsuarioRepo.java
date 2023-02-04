package org.example.repositorios;

import org.example.modelos.Usuario;

import java.sql.SQLException;

public interface UsuarioRepo extends Repositorio<Usuario>{
    Usuario porNombreUsuario(String nombre) throws SQLException;
}

