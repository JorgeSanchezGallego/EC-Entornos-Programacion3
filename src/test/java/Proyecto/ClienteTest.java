package Proyecto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void clienteBase(){
        cliente = new Cliente("Jorge", "12345678A", "666333666", "jorge@gmail.com");
    }

    @Test
    public void testGetNombre(){
        assertEquals("Jorge", cliente.getNombre());
    }

    @Test
    public void testGetDni(){
        assertEquals("12345678A", cliente.getDni());
    }

    @Test
    public void testGetTelefono(){
        assertEquals("666333666", cliente.getTelefono());
    }

    @Test
    public void testGetEmail(){
        assertEquals("jorge@gmail.com", cliente.getEmail());
    }

    @Test
    public void testSetTelefono(){
    assertEquals("666333666", cliente.getTelefono());
    cliente.setTelefono("333666333");
    assertEquals("333666333", cliente.getTelefono());
    }

    @Test
    public void testToString(){
        String esperado = "{ Nombre: Jorge', Dni: 12345678A', Teléfono: 666333666', Email: jorge@gmail.com'}";
        assertEquals(esperado, cliente.toString());
    }






}
