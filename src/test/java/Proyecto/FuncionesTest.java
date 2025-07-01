package Proyecto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static Proyecto.Main.clientes;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionesTest {

    private Cliente cliente;

    @BeforeEach
    public void clienteBase(){
        cliente = new Cliente("Jorge", "12345678A", "666333666", "jorge@gmail.com");
    }

    @AfterEach
    public void limpiar() {
        cliente = null;
    }
    @Test
    public void testGestionClientesCorrecto(){
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals(3, Funciones.gestionClientes());
    }

    @Test
    public void testGestionClientesIncorrecto(){
        String input = "Alta\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals(-1,Funciones.gestionClientes());
    }

    @Test
    public void testAltaCliente(){
    clientes.add(cliente);
    assertEquals(cliente, clientes.get(0));
    }

    @Test
    public void testBuscarPorDni(){
        clientes.add(cliente);
        String input = "12345678A\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
       Funciones.buscarPorDni();
    }

    @Test
    public void testBuscarPorDniIncorrecto(){
        clientes.add(cliente);
        String input = "12345678B\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Funciones.buscarPorDni();
    }




}
