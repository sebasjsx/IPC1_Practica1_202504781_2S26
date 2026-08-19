/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.practica1;

/**
 *
 * @author abads
 */
public class Validaciones {

    public boolean validarFormatoPlaca(String placa) {
        if (placa.length() != 7) {
            System.out.println("ERROR: laca invalida. Debe usar el formato P###LLL");
            return false;
        }

        if (placa.charAt(0) != 'P') {
            System.out.println("ERRRO: Placa invalida. Debe comenzar con P y siempre mayuscula");
            return false;
        }

        for (int posicion = 1; posicion <= 3; posicion++) {
            if (Character.isDigit(placa.charAt(posicion)) == false) {
                System.out.println("ERRRO: La placa debe tener tres numeros despues de P");
                return false;
            }
        }

        for (int posicion = 4; posicion <= 6; posicion++) {
            if (Character.isLetter(placa.charAt(posicion)) == false || Character.isUpperCase(placa.charAt(posicion)) == false) {
                System.out.println("ERRRO: La placa debe terminar con tres letras mayusculas");
                return false;
            }
        }
        return true;
    }

    public boolean placaRepetida(String placa, String[][] placas) {
        for (int fila = 1; fila <= 8; fila++) {
            for (int columna = 1; columna <= 8; columna++) {
                if (placas[fila][columna] != null && placas[fila][columna].equals(placa)) {
                    System.out.println("ERROR: La placa ya esta registrada.");
                    return true;
                }
            }
        }
        return false;
    }
}
