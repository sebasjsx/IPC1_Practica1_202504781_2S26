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
    private double ingresos = 0;
    private int contadorVehiculos = 0;

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
            realizarPago(entrada);

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

    public void realizarPago(Scanner entrada) {
        double monto;

        do {
            System.out.println("Tarifa Q10 todo el dia!");
            System.out.print("Ingrese el monto entregado: Q");
            monto = entrada.nextDouble();

            if (monto < 0) {
                System.out.println("No se puede un monto negativo");
            } else if (monto < 10) {
                System.out.println("Monto insuficiente");
            }
        } while (monto < 10);
        double cambio = monto - 10;
        System.out.println("Cambio: Q." + cambio);

        ingresos = ingresos + 10;
        contadorVehiculos++;
    }

    public void mostrarIngresos() {
        System.out.println("=== INGRESOS ===");
        System.out.println("Vehiculos cobrados: " + contadorVehiculos);
        System.out.println("Ingresos totales: " + ingresos);
    }

    public int[] buscarVehiculo(Scanner entrada) {

        System.out.print("Ingrese la placa: ");
        String placa = entrada.next();

        for (int fila = 1; fila <= 8; fila++) {

            for (int columna = 1; columna <= 8; columna++) {

                if (placas[fila][columna] != null && placas[fila][columna].equals(placa)) {

                    int[] posicion = new int[2];

                    posicion[0] = fila;
                    posicion[1] = columna;

                    System.out.println("Vehiculo con placa *" + placa + "* encontrado.");
                    System.out.println("Fila: " + fila);
                    System.out.println("Columna: " + columna);

                    return posicion;
                }
            }
        }

        System.out.println("No se encontro un vehiculo con esa placa.");
        return null;
    }

    public void retirarVehiculo(Scanner entrada) {

        int[] posicion = buscarVehiculo(entrada);

        if (posicion != null) {

            int fila = posicion[0];

            int columna = posicion[1];

            tablero[fila][columna] = "L";
            placas[fila][columna] = null;

            System.out.println("El vehiculo se retiro correctamente y se libero ese espacio");
        }
    }
}
