/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.practica1;

/**
 *
 * @author abads
 */
public class Tablero {

    private String[][] tablero = new String[10][10];

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
}