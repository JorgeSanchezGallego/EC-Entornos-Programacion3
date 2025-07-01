package Proyecto;

/**
 * Clase cliente con sus atributos
 * @author Jorge Sánchez
 * @version 1.0
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String dni;
    private String telefono;
    private String email;

    //Constructor

    /**
     * Constructor que construye un cliente con sus datos
     * @param nombre nombre del cliente
     * @param dni dni del cliente
     * @param telefono telefono del cliente
     * @param email correo del cliente
     */
    public Cliente(String nombre, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }


    /**
     * Devuelve el nombre del cliente
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Devuelve el dni del cliente
     * @return Dni del cliente
     */
    public String getDni() {
        return dni;
    }


    /**
     * Devuelve el teléfono del cliente
     * @return Teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }


    /**
     * Devuelve el correo del cliente
     * @return Email del cliente
     */
    public String getEmail() {
        return email;
    }


    /**
     * Méto-do para modificar un télefono de un cliente
     * @param telefono nuevo numero de telefono para el cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    /**
     *Devuelve una representación del objeto Cliente con sus atributos
     * @return datos del cliente
     */
    @Override
    public String toString() {
        return "{" +
                " Nombre:" + nombre + '\'' +
                ", Dni=" + dni + '\'' +
                ", Teléfono=" + telefono + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}

