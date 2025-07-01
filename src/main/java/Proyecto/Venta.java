package Proyecto;

import java.util.ArrayList;

import static Proyecto.Main.ventas;

public class Venta {
    //Atributos
    private Cliente cliente;
    private ArrayList<Pajaro> lineasDeVenta;
    private String fecha;

    //Constructor
    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.lineasDeVenta = new ArrayList<>();
    }

    public void setLineasDeVenta(ArrayList<Pajaro> lineasDeVenta) {
        this.lineasDeVenta = lineasDeVenta;
    }

    public void añadirPajaro(Pajaro pajaro){
        lineasDeVenta.add(pajaro);
    }

    public Cliente getCliente() {
        return cliente;
    }



    public ArrayList<Pajaro> getLineasDeVenta() {
        return lineasDeVenta;
    }



    @Override
    public String toString() {
        return
                cliente +
                        ", lineasDeVenta=" + lineasDeVenta +
                        '}';
    }
}