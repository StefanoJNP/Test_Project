package org.example;


public class UsuarioServicio {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicio(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public UsuarioDto crearUsuario(final String nombre){
        if (nombre == null){
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        return usuarioRepositorio.crearUsuario(nombre);
    }

    public  UsuarioDto obtenerUsuario(final long id){

         return  usuarioRepositorio.obtenerUsuario(id);
    }

    public  UsuarioDto actualizarUsuario(final String nombre){

        return usuarioRepositorio.actualizarUsuario(nombre);
    }

}
