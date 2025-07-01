package Proyecto;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Proyecto.Main.*;
import static Proyecto.Venta.*;

/**
 * Clase funciones para tener to-do ordenado
 * @author Jorge Sánchez
 * @version 1.0
 */
public class Funciones {
    static Scanner teclado = new Scanner(System.in);

    //Menu principal

    /**
     * Muestra por terminal el menu principal con sus opciones
     */
    public static void menuPrincipal(){
        System.out.println("### MENÚ PRINCIPAL ###");
        System.out.println("1. Gestión de clientes.");
        System.out.println("2. Gestión de pájaros.");
        System.out.println("3. Gestión de ventas.");
        System.out.println("4. Salir.");
        System.out.println("Elige un índice.");
    }


    //Apartado clientes

    /**
     * Muestra el menu de gestión de clientes y lee la opcion marcada por el usuario
     * @return option en caso de que el usuario marque un parametro correcto, y en caso de que no, devuelve -1
     */
    public static int gestionClientes(){
        System.out.println("### Gestión de Clientes ###");
        System.out.println("1. Alta.");
        System.out.println("2. Baja. ");
        System.out.println("3. Busqueda por DNI. ");
        System.out.println("4. Modificación. ");
        System.out.println("5. Listado. ");
        System.out.println("Elige un índice. ");
        try {
            int option = teclado.nextInt();
            teclado.nextLine();
            return option;
        } catch (InputMismatchException e){
            System.out.println("Por favor, introduce un índice. ");
            return -1;


        }


    }


    /**
     * Recoge parametros necesarios para la creación del Cliente y lo crea y lo añade a la lista de clientes
     */
    public static void altaCliente(){
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Dni: ");
        String dni = teclado.nextLine();
        System.out.println("Teléfono: ");
        String telefono = teclado.nextLine();
        System.out.println("Email: ");
        String email = teclado.nextLine();
        clientes.add(new Cliente(nombre, dni, telefono, email));
        System.out.println("Cliente añadido. ");
    }


    /**
     * Recoge un dni, verifica si existe, si existe muestra por pantalla al Cliente.
     * Si no lo encuentra,  mensaje de error.
     */
    public static void buscarPorDni(){
        System.out.println("Dime el DNI que quieres buscar en la base de datos");
        boolean encontrado = false;
        String dniBuscado = teclado.nextLine();
        for (Cliente cliente : clientes){
            if (cliente.getDni().equalsIgnoreCase(dniBuscado)){
                encontrado = true;
                System.out.println("¡Cliente encontrado!");
                System.out.println(cliente.getNombre() + ", " + cliente.getDni() + ", " + cliente.getEmail() +", " + cliente.getTelefono());
            }
        }
        if (!encontrado){
            System.out.println("El Dni buscado no se encuentra en nuestra base de datos. ");
        }
    }

    /**
     * Muestra la lista de clientes, solicita el índice del cliente a borrar y elimina ese cliente de la lista.
     * Maneja excepciones en caso de que el índice sea inválido o la entrada no sea un número.
     */
    public static void bajaCliente(){
        listaClientes();
        System.out.println("¿Que índice de cliente quieres borrar?");
        try {
            int indiceCliente = teclado.nextInt() - 1;
            teclado.nextLine();
            System.out.println("Borrando cliente: " + clientes.get(indiceCliente).getNombre());
            clientes.remove(indiceCliente);
            System.out.println("Cliente borrado. ");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Índice invalido. ");
        } catch (InputMismatchException e){
            System.out.println("Por favor, introduce un índice");
            teclado.nextLine();
        }
    }

    /**
     * Muestra los clientes, guarda al cliente seleccionado, hace comprobaciones para saber si el índice es válido.
     * Guarda el nuevo número de teléfono.
     */
    public static void modificarTelefono(){
        listaClientes();
        System.out.println("¿Que índice de cliente quieres cambiar el teléfono?");

        try {
            int indiceCliente = teclado.nextInt() -1;
            teclado.nextLine();
            if (indiceCliente < 0 || indiceCliente >= clientes.size()){
                System.out.println("Índice invalido. ");
                return;
            }
            System.out.println("¿Cúal es el nuevo teléfono?");
            String nuevoTelefono = teclado.nextLine();
            Cliente cliente = clientes.get(indiceCliente);
            cliente.setTelefono(nuevoTelefono);
            System.out.println("Teléfono modificado. ");
        } catch (InputMismatchException e){
            System.out.println("Introduce una cadena de números. ");
            teclado.nextLine();
        }

    }

    /**
     * Muestra por terminal la lista de clientes y sus atributos
     */
    public static void listaClientes(){
        for ( int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            System.out.println((i+1)+ ". " + cliente.getNombre() + ", " + cliente.getTelefono() + ", " + cliente.getDni() + ", " + cliente.getEmail() );
        }
    }


    //Apartado Pajaros

    /**
     * Muestra el menu de gestión de pájaros y lee la opción marcada por el usuario
     * @return option en caso de que el usuario marque un parámetro correcto, y en caso de que no, devuelve -1
     */
    public static int gestionPajaros(){
        System.out.println("### Gestión de Pájaros ###");
        System.out.println("1. Alta.");
        System.out.println("2. Baja. ");
        System.out.println("3. Busqueda por especie. ");
        System.out.println("4. Modificación precio. ");
        System.out.println("5. Listado. ");
        System.out.println("Elige un índice. ");
        try {
            int option = teclado.nextInt();
            teclado.nextLine();
            return option;
        } catch (InputMismatchException e){
            System.out.println("Por favor, introduce un índice.");
            return -1;
        }

    }


    /**
     * Recoge parámetros necesarios para la creación del Pájaro y lo crea y guarda en la lista
     * Maneja excepciones.
     */
    public static void altaPajaro(){
        System.out.println("Especie: ");
        String especie = teclado.nextLine();
        System.out.println("Color: ");
        String color = teclado.nextLine();
        System.out.println("Precio: ");
        try {
            double precio = teclado.nextDouble();
            teclado.nextLine();
            pajaros.add(new Pajaro(especie, color, precio));
            System.out.println("Pájaro añadido. ");
        } catch (InputMismatchException e){
            System.out.println("Por favor, introduce un número. ");
            teclado.nextLine();
        }

    }

    /**
     * Muestra por terminal la lista de pajaros, guarda tu selección de pájaro a borrar y lo borra
     * Maneja excepciones
     */
    public static void bajaPajaro(){
        listaPajaros();
        System.out.println("¿Que índice de pájaro quieres borrar?");
        try {
            int indicePajaro = teclado.nextInt() -1;
            teclado.nextLine();
            pajaros.remove(indicePajaro);
            System.out.println("Pájaro eliminado. ");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Índice invalido. ");
        }

    }


    /**
     * Guarda la especie buscada y busca en la lista si se encuentra y la muestra con sus atributos.
     * Si no la encuentra muestra mensaje de error.
     */
    public static void buscarPorEspecie(){
        System.out.println("Dime la especie que quieres buscar en la base de datos");
        boolean encontrado = false;
        String especieBuscada = teclado.nextLine();
        for (Pajaro pajaro : pajaros){
            if (pajaro.getEspecie().equalsIgnoreCase(especieBuscada)){
                System.out.println("¡Pájaro encontrado!");
                System.out.println(pajaro.getEspecie() + ", " + pajaro.getPrecio() + ", " + pajaro.getColor());
                encontrado = true;
            }

        }
        if (!encontrado){
            System.out.println("La especie buscada no se encuentra en nuestro catálogo. ");
        }
    }

    /**
     * Muestra la lista de pajaros, guarda el pájaro a modificar.
     * Maneja excepciones de índice.
     * Guarda el nuevo precio y verifica que no sea 0 o menor.
     * Modifica el precio.
     */
    public static void modificarPrecioPajaro(){
        listaPajaros();
        System.out.println("¿Que índice de pajaro quieres cambiar el precio?");
        try {
            int indicePajaro = teclado.nextInt() - 1;
            teclado.nextLine();
            if (indicePajaro < 0 || indicePajaro >= pajaros.size()){
                System.out.println("Índice invalido. ");
                return;
            }
            System.out.println("¿Cúal es el nuevo precio?");
            double nuevoPrecio = teclado.nextDouble();
            teclado.nextLine();
            if (nuevoPrecio <= 0){
                System.out.println("El precio no puede ser 0 o menor. ");
                return;
            }
            Pajaro pajaro = pajaros.get(indicePajaro);
            pajaro.setPrecio(nuevoPrecio);
            System.out.println("Precio actualizado. ");
        } catch (InputMismatchException e){
            System.out.println("Por favor, introduce un número. ");
            teclado.nextLine();
        }
    }

    /**
     * Muestra por terminal la lista de pájaros disponibles.
     */
    public static void listaPajaros(){
        for ( int i = 0; i < pajaros.size(); i++){
            Pajaro pajaro = pajaros.get(i);
            System.out.println((i+1)+ ". " + pajaro.getEspecie() + ", " + pajaro.getColor() + ", " + pajaro.getPrecio() + " € "  );
        }
    }

    //Apartado Ventas

    /**
     * Muestra el menú de la gestion de ventas.
     * @return option como opción elegida por el usuario.
     */
    public static int gestionVentas(){
        System.out.println("### Gestión de Ventas###");
        System.out.println("1. Nueva venta.");
        System.out.println("2. Mostras ventas realizadas. ");
        System.out.println("3. Mostrar ventas por cliente. ");
        System.out.println("4. Mostrar dinero registrado. ");
        System.out.println("Elige un índice. ");
        int option = teclado.nextInt();
        teclado.nextLine();
        return option;
    }


    /**
     * Primero verifica si tenemos clientes o pajaros en el programa.
     * Muestra clientes y guarda la respuesta del usuario.
     * Muestra pajaros y guarda la respuesta del usuario.
     * Borra de la lista el pájaro comprado y si la lista no esta vacia, vuelve a preguntar por otra venta.
     * Si esta vacia, sale del bucle.
     * Añade la venta
     */
    public static void nuevaVenta() {
        if (clientes.isEmpty() || pajaros.isEmpty()) {
            System.out.println("Lista de clientes o lista de pájaros vacia. ");
            return;
        }
        System.out.println("Elige un cliente por índice. ");
        listaClientes();
        int posicionCliente = teclado.nextInt() -1;
        teclado.nextLine();
        if (posicionCliente < 0 || posicionCliente >= clientes.size())return;
        Cliente clientePosicion = clientes.get(posicionCliente);
        Venta venta = new Venta(clientePosicion);

        int opcion = 1;
        while (opcion == 1){
            System.out.println("Añade un pájaro a tu cliente. ");
            listaPajaros();
            int posicionPajaro = teclado.nextInt() -1;
            teclado.nextLine();
            if (posicionPajaro >= 0 && posicionPajaro < pajaros.size()){
                venta.añadirPajaro(pajaros.get(posicionPajaro));
                pajaros.remove(posicionPajaro);


            } if (pajaros.isEmpty()){
                break;
            } else {
                System.out.println("¿Desea añadir otro pájaro? 1 para seguir añadiendo. ");
                opcion = teclado.nextInt();
                teclado.nextLine();
            }
        }

        ventas.add(venta);
        System.out.println("Añadiendo venta...");
    }


    /**
     * Recorre las ventas.
     * Muestra el cliente y sus compras.
     */
    public static void ventasRealizadas(){
        for (Venta venta : ventas){
            System.out.println("Cliente: " + venta.getCliente());
            System.out.println("Líneas de venta: " + venta.getLineasDeVenta());
        }
    }

    /**
     * Muestra lista de clientes.
     * Maneja excepciones de índice.
     * Si el cliente tiene ventas, muestra su venta.
     * Si no, muestra que no tiene ventas registradas.
     */
    public static void ventasPorCliente(){
        listaClientes();
        int posicionCliente = teclado.nextInt() -1;
        teclado.nextLine();


        if (posicionCliente < 0 || posicionCliente >= clientes.size()) {
            System.out.println("Posición inválida.");
            return;
        }
        Cliente clienteSeleccionado = clientes.get(posicionCliente);
        boolean existeVenta = false;

        System.out.println("Ventas del cliente: " + clienteSeleccionado.getNombre());
        for (Venta venta : ventas){
            if (venta.getCliente().equals(clienteSeleccionado)){
                System.out.println(venta);
                existeVenta = true;
            }

        }
        if (!existeVenta){
            System.out.println("Este cliente no tiene ventas registradas. ");
        }

    }


    /**
     * Inicializamos el total en 0
     * Recorremos las ventas.
     * Por cada venta, al total le sumamos el precio del pajaro.
     * Por cada vuelta el total lo vamos sumando a otra variable para guardar el total de todas las compras.
     */
    public static void importeTotalVenta(){
        double totalDiferentesClientes = 0;
        for (Venta venta : ventas){
            double totalVenta = 0;
            for (Pajaro pajaro : venta.getLineasDeVenta()){
                totalVenta += pajaro.getPrecio();
            }

            totalDiferentesClientes += totalVenta;

        }
        System.out.println("Total de ventas: " + totalDiferentesClientes + " €");
    }
}
