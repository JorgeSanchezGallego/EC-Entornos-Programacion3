package Proyecto;

import java.util.ArrayList;

import static Proyecto.Main.ventas;

/**
 * Clase Venta con sus atributos
 * @author Jorge Sánchez
 * @version 1.0
 */
public class Venta {
    //Atributos
    private Cliente cliente;
    private ArrayList<Pajaro> lineasDeVenta;
    private String fecha;

    //Constructor

    /**
     * Constructor para construir una Venta con sus atributos
     * @param cliente cliente para añadirlo directamente a la venta
     */
    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.lineasDeVenta = new ArrayList<>();
    }




    /**
     * Añadir un pájaro a la linea de venta
     * @param pajaro objeto pajaro para añadirlo a lineas de venta
     */
    public void añadirPajaro(Pajaro pajaro){
        lineasDeVenta.add(pajaro);
    }

    //Getters


    /**
     * Devuelve un objeto cliente
     * @return objeto Cliente
     */
    public Cliente getCliente() {
        return cliente;
    }


    /**
     * Devuelve un arraylist de lineas de venta
     * @return arraylist de lineas de venta
     */
    public ArrayList<Pajaro> getLineasDeVenta() {
        return lineasDeVenta;
    }


    /**
     * Devuelve una representación del objeto Venta con sus atributos
     * @return Datos de la venta
     */
    @Override
    public String toString() {
        return
                cliente +
                        ", lineasDeVenta=" + lineasDeVenta +
                        '}';
    }
}