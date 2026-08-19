/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.practica1;

import java.util.Scanner;

/**
 *
 * @author abads
 */
public class Menu {

    public void mostrarMenu(Tablero tablero) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("===== SISTEMA DE ESTACIONAMIENTO =====");
            System.out.println("1. Ingresar vehiculo");
            System.out.println("2. Retirar vehiculo");
            System.out.println("3. Mostrar estacionamiento");
            System.out.println("4. Buscar vehiculo");
            System.out.println("5. Mostrar ruta mas corta");
            System.out.println("6. Mostrar ingresos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
            } else {
                System.out.println("Entrada invalida. Debe ingresar un numero.");
                entrada.next();
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    System.out.println("");
                    System.out.println("===== INGRESAR VEHICULO =====");
                    tablero.ingresarVehiculo(entrada);
                }
                case 2 -> {
                    System.out.println("");
                    System.out.println("===== RETIRAR VEHICULO =====");
                    tablero.retirarVehiculo(entrada);
                }
                case 3 -> {
                    System.out.println("");
                    System.out.println("===== ESTACIONAMIENTO =====");
                    tablero.mostrarTablero();
                }
                case 4 -> {
                    System.out.println("");
                    System.out.println("===== BUSCAR VEHICULO =====");
                    tablero.buscarVehiculo(entrada);
                }
                case 5 -> {
                    System.out.println("");
                    System.out.println("===== RUTA MAS CORTA =====");
                    tablero.mostrarRutaMasCorta();
                }
                case 6 -> {
                    System.out.println("");
                    System.out.println("=== INGRESOS ===");
                    tablero.mostrarIngresos();
                }
                case 7 -> {
                }

                default ->
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 7);
    }
}
