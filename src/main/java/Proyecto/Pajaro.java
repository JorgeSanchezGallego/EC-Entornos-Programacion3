package Proyecto;

public class Pajaro {
    //Atributos
    private String especie;
    private String color;
    private double precio;

    //Constructor
    public Pajaro(String especie, String color, double precio) {
        this.especie = especie;
        this.color = color;
        this.precio = precio;
    }

    public String getEspecie() {
        return especie;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pajaro:" +
                " Especie: " + especie + '\'' +
                ", Color: " + color + '\'' +
                ", Precio: " + precio
                ;
    }
}
