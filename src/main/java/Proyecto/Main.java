package Proyecto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Proyecto.Funciones.*;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Pajaro> pajaros = new ArrayList<>();
    static ArrayList<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            menuPrincipal();
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Por favor, introduce un índice valido. ");
                teclado.nextLine();
                opcion = -1;
            }
            switch (opcion){
                case 1 -> {
                    int option = gestionClientes();
                    switch (option){
                        case 1 -> altaCliente();
                        case 2 -> bajaCliente();
                        case 3 -> buscarPorDni();
                        case 4 -> modificarTelefono();
                        case 5 -> listaClientes();
                        default -> System.out.println("Opción invalida. ");
                    }
                }
                case 2 -> {
                    int option = gestionPajaros();
                    switch (option){
                        case 1 -> altaPajaro();
                        case 2 -> bajaPajaro();
                        case 3 -> buscarPorEspecie();
                        case 4 -> modificarPrecioPajaro();
                        case 5 -> listaPajaros();
                        default -> System.out.println("Opción invalida. ");
                    }
                }
                case 3 -> {
                    int option = gestionVentas();
                    switch (option){
                        case 1 -> nuevaVenta();
                        case 2 -> ventasRealizadas();
                        case 3 -> ventasPorCliente();
                        case 4 -> importeTotalVenta();
                        default -> System.out.println("Opción invalida. ");
                    }
                }
                case 4 ->{
                    System.out.println("Adiós, gracias por usar nuestro programa de ventas. ");
                }
                default -> System.out.println("Opción invalida. ");
            }

        } while (opcion !=4);


    }

}