package org.example;

public interface UsuarioRepositorio {
    UsuarioDto crearUsuario(String nombre);

    UsuarioDto obtenerUsuario(Long id);

    UsuarioDto actualizarUsuario(String nombre);

    boolean eliminarUsuario(Long id);

    UsuarioDto inhabilitarUsuario(Long id);

}
