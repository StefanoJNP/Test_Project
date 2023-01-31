package org.example;

import java.util.Objects;

public class UsuarioDto {

    final Long id;
    final String nombre;
    final int telefono;

    final int estado;

    public UsuarioDto(Long id, String nombre, int telefono, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() { return telefono; }

    public int getEstado() { return estado; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return  true;
        if (obj == null || getClass() != obj.getClass()) return  false;
        UsuarioDto that = (UsuarioDto) obj;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre);
    }
}
