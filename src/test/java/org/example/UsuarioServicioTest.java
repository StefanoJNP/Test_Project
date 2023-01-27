package org.example;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class UsuarioServicioTest {

    @Mock
    private UsuarioRepositorio usuarioRepositorio;
    private UsuarioServicio usuarioServicio;

    @BeforeEach
    public void setup(){
        usuarioServicio = new UsuarioServicio(usuarioRepositorio);
    }

    @DisplayName("Dado un usuario que queremos crear esperamos que cuando llamamos a crearUsuario()" +
            "Esperamos que el usuario este creado")

    @Test
    public void dadoUsuarioParaCrearEsperamosUsuarioCreado() {
        UsuarioDto objetoSimulado = new UsuarioDto(1L, "Prueba");
        UsuarioDto esperado = new UsuarioDto(1L, "Prueba");
        Mockito.when(usuarioRepositorio.crearUsuario(Mockito.anyString()))
                .thenReturn(objetoSimulado);
        final UsuarioDto resultado = usuarioServicio.crearUsuario("Prueba");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre,
                "Los nombres son diferentes");
        Assertions.assertEquals(resultado, esperado);
        Mockito.verify(usuarioRepositorio, Mockito.times(1)).crearUsuario("Prueba");
    }

    @DisplayName("Dado un usuario queremos obtenerlo con el método obtenerUsuario()" +
            "Esperamos que el usuario no este creado.")

    @Test
    void testObtenerUsuarioconMockito() {
        UsuarioDto objetoSimulado = new UsuarioDto(1L, "Juan");
        UsuarioDto esperado = new UsuarioDto(1L, "Juan");
        Mockito.when(usuarioRepositorio.obtenerUsuario(1L))
                .thenReturn(objetoSimulado);
        final UsuarioDto resultado = usuarioServicio.obtenerUsuario(1L);
        Assertions.assertEquals(esperado, resultado);
        Mockito.verify(usuarioRepositorio).obtenerUsuario(1L);
    }

    @Test
    void actualizarUsuario() {
        UsuarioDto objetoSimulado = new UsuarioDto(1L, "Prueba");
        UsuarioDto esperado = new UsuarioDto(1L, "Miguel");
        Mockito.when(usuarioRepositorio.actualizarUsuario(Mockito.anyString()))
                .thenReturn(objetoSimulado);
        final UsuarioDto resultado = usuarioServicio.actualizarUsuario("Prueba");
        //Assertions.assertEquals(esperado, resultado);
        Assertions.assertNotEquals(esperado.nombre, resultado.nombre,
                "Los nombres son iguales");
    }
}