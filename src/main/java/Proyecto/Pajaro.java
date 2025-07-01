package Proyecto;

/**
 * Clase pajaro con sus atributos
 * @author Jorge Sánchez
 * @version 1.0
 */
public class Pajaro {
    //Atributos
    private String especie;
    private String color;
    private double precio;

    //Constructor

    /**
     * Constructor que construye un pajaro con sus atributos
     * @param especie Especie del pájaro
     * @param color Color del pájaro
     * @param precio Precio del pájaro
     */
    public Pajaro(String especie, String color, double precio) {
        this.especie = especie;
        this.color = color;
        this.precio = precio;
    }


    /**
     * Devuelve la especie del pájaro
     * @return especie del pájaro
     */
    public String getEspecie() {
        return especie;
    }


    /**
     * Devuelve el color del pájaro
     * @return Color del pájaro
     */
    public String getColor() {
        return color;
    }


    /**
     * Devuelve el precio del pájaro
     * @return Precio del pájaro
     */
    public double getPrecio() {
        return precio;
    }

    //Setters

    /**
     * Méto-do para cambiar el precio del pájaro
     * @param precio nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    /**
     * Devuelve una representación del objeto Pájaro con sus atributos
     * @return Datos del pájaro
     */
    @Override
    public String toString() {
        return "Pajaro:" +
                " Especie: " + especie + '\'' +
                ", Color: " + color + '\'' +
                ", Precio: " + precio
                ;
    }
}
