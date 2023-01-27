package org.example;

public interface UsuarioRepositorio {
    UsuarioDto crearUsuario(String nombre);

    UsuarioDto obtenerUsuario(Long id);
}
