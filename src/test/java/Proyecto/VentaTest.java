package Proyecto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VentaTest {

    private Venta venta;
    private Cliente cliente;
    private Pajaro pajaro;

    @BeforeEach
    public void ventaBase(){
        cliente = new Cliente("Jorge", "12345678A", "666333666", "jorge@gmail.com");
        venta = new Venta(cliente);
        pajaro = new Pajaro("Paloma", "Blanca", 500.50);
    }

    @Test
    public void testAñadirPajaro(){
        assertTrue(venta.getLineasDeVenta().isEmpty());
        venta.añadirPajaro(pajaro);
        assertFalse(venta.getLineasDeVenta().isEmpty());
        assertEquals(1, venta.getLineasDeVenta().size());
        assertEquals(pajaro, venta.getLineasDeVenta().get(0));
    }

    @Test
    public void testGetCliente(){
        assertEquals(cliente, venta.getCliente());
    }

    @Test
    public void testGetLineasDeVenta(){
        assertTrue(venta.getLineasDeVenta().isEmpty());
        venta.añadirPajaro(pajaro);
        ArrayList<Pajaro> lineas = venta.getLineasDeVenta();
        assertEquals(1, lineas.size());
        assertEquals(pajaro, lineas.get(0));
    }

    @Test
    public void testToString(){
        venta.añadirPajaro(pajaro);
        String esperado = cliente.toString() + ", lineasDeVenta=[" + pajaro.toString() + "]}";

        assertEquals(esperado, venta.toString());
    }

}
