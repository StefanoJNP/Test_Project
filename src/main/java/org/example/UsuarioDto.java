package org.example;

import java.util.Objects;

public class UsuarioDto {

    final Long id;
    final String nombre;

    public UsuarioDto(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return  true;
        if (obj == null || getClass() != obj.getClass()) return  false;
        UsuarioDto that = (UsuarioDto) obj;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
    }
}
