package Proyecto;

public class Cliente {
    //Atributos
    private String nombre;
    private String dni;
    private String telefono;
    private String email;

    //Constructor
    public Cliente(String nombre, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

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

