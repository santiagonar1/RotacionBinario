/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rotacionbinario;

import java.util.Scanner;

/**
 *
 * @author santiago
 */
public class RotacionBinario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String binario;
        int numero;
        System.out.println("Ingrese el numero binario de máx 31 bits: ");
        binario = entrada.next();
        try {
            // Verifico que el binario ingresado sea válido
            numero = Integer.parseInt(binario, 2);
            do {
                /*
                 * Para rotar a la derecha agregar:
                 * 
                 * binario = rotarDerecha(binario)
                 * System.out.println("Rotacion derecha: " + binario);
                 * 
                 * Y comentar las lineas de rotación izquierda.
                 */
                binario = rotarIzquierda(binario);
                System.out.println("Rotacion izquierda: " + binario);
                System.out.println("Presione 's' para continuar rotando, u otra tecla para salir");
            } while (entrada.next().equals("s"));
        } catch (NumberFormatException e) {
            System.out.println("Ha ingresado un numero invalido");
        }
    }

    /**
     * Esta función realiza una rotación a la derecha, por ejemplo: 10010 se
     * convertirá en 01001
     *
     * @param binario
     * @return binario rotado a la derecha
     */
    public static String rotarDerecha(String binario) {
        String binarioRotado;
        binarioRotado = binario.charAt(binario.length() - 1) + binario.substring(0, binario.length() - 1);
        return binarioRotado;
    }

    /**
     * Esta función realiza una rotación a la izquierda, por ejemplo: 10010 se
     * convertirá en 00101
     *
     * @param binario
     * @return binario rotado a la izquierda
     */
    public static String rotarIzquierda(String binario) {
        String binarioRotado;
        binarioRotado = binario.substring(1) + binario.charAt(0);
        return binarioRotado;
    }
}
