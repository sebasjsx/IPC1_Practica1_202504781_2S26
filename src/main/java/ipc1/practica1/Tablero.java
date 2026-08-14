/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.practica1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author abads
 */
public class Tablero {

    private String[][] tablero = new String[10][10];
    private String[][] placas = new String[10][10];

    public void llenarTablero() {
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                if (fila == 0 || fila == 9 || columna == 0 || columna == 9) {
                    tablero[fila][columna] = "=";
                } else {
                    tablero[fila][columna] = "L";
                }
            }
        }
    }

    public void mostrarTablero() {

        System.out.print("    ");
        for (int columna = 1; columna <= 8; columna++) {
            System.out.print(columna + " ");
        }

        System.out.println();
        for (int fila = 0; fila < 10; fila++) {

            if (fila >= 1 && fila <= 8) {
                System.out.print(fila + " ");
            } else {
                System.out.print("  ");
            }

            for (int columna = 0; columna < 10; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }

            System.out.println();
        }
    }

    public void colocarEntradaSalida() {
        colocarEnBorde("E");
        colocarEnBorde("S");
    }

    private void colocarEnBorde(String letra) {

        Random aleatorio = new Random();
        boolean colocado = false;

        while (colocado == false) {

            int fila = aleatorio.nextInt(10);
            int columna = aleatorio.nextInt(10);

            boolean esquina = (fila == 0 || fila == 9) && (columna == 0 || columna == 9);

            if (tablero[fila][columna].equals("=") && esquina == false) {
                tablero[fila][columna] = letra;
                colocado = true;
            }
        }
    }

    public void ingresarVehiculo(Scanner entrada) {

        System.out.print("Ingrese la placa: ");
        String placa = entrada.next();
        System.out.print("Ingrese la fila: ");
        int fila = entrada.nextInt();
        System.out.print("Ingrese la columna: ");
        int columna = entrada.nextInt();

        if (fila >= 1 && fila <= 8 && columna >= 1 && columna <= 8) {

            if (tablero[fila][columna].equals("L")) {
                tablero[fila][columna] = "A";
                placas[fila][columna] = placa;
                System.out.println("Vehiculo ingresado correctamente!");
            } else {
                System.out.println("El espacio ya esta ocupado");
            }
            
        } else {
            System.out.println("La fila y columna deben estar entre 1 y 8");
        }
    }
}
