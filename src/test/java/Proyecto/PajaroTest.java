package Proyecto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PajaroTest {
    private Pajaro pajaro;

    @BeforeEach
    public void pajaroBase(){
    pajaro = new Pajaro("Paloma", "Blanca", 500.50);
    }

    @Test
    public void testGetEspecie(){
        assertEquals("Paloma", pajaro.getEspecie());
    }

    @Test
    public void testGetColor(){
        assertEquals("Blanca", pajaro.getColor());
    }

    @Test
    public void testGetPrecio(){
        assertEquals(500.50, pajaro.getPrecio());
    }

    @Test
    public void testSetPrecio(){
        assertEquals(500.50, pajaro.getPrecio());
        pajaro.setPrecio(600.29);
        assertEquals(600.29, pajaro.getPrecio());
    }

    @Test
    public void testToString(){
        String esperado = "Pajaro: Especie: Paloma', Color: Blanca', Precio: 500.5";
        assertEquals(esperado, pajaro.toString());
    }
}
