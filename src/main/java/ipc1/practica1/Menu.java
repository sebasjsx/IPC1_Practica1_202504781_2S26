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
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE ESTACIONAMIENTO =====");
            System.out.println("1. Ingresar vehiculo");
            System.out.println("2. Retirar vehiculo");
            System.out.println("3. Mostrar estacionamiento");
            System.out.println("4. Buscar vehiculo");
            System.out.println("5. Mostrar ruta mas corta");
            System.out.println("6. Mostrar ingresos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    tablero.ingresarVehiculo(entrada);
                    break;

                case 2:
                    tablero.retirarVehiculo(entrada);
                    break;

                case 3:
                    tablero.mostrarTablero();
                    break;

                case 4:
                    tablero.buscarVehiculo(entrada);
                    break;

                case 5:
                    break;

                case 6:
                    tablero.mostrarIngresos();
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 7);
    }
}
