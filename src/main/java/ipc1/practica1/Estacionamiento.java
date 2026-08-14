/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ipc1.practica1;

/**
 *
 * @author abads
 */
public class Estacionamiento {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Menu menu = new Menu();

        tablero.llenarTablero();
        tablero.colocarEntradaSalida();
        menu.mostrarMenu(tablero);
    }
}