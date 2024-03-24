/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservaasientos;

import java.util.Scanner;

/**
 *
 * @author JDANIEL
 */
public class ReservaAsientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int asiento = 0, fila = 0;
        char[][] sala = new char[10][10];
        boolean salir = false, bandera = false;
        String respuesta, mostrar;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < sala.length; i++) {

            for (int j = 0; j < sala.length; j++) {

                sala[i][j] = 'L';
            }
        }

        System.out.println("===========  BIENVENIDO AL SISTEMA DE RESERVA  ============\n");

        while (!salir) {

            System.out.println("¿Desea ver los asientos disponibles? S:si cualquier otra letra para continuar");

            mostrar = sc.next();
            if (mostrar.equalsIgnoreCase("s")) {

                mostrarAsientos(sala);
            }

            while (!bandera) {

                System.out.println("Ingresa tu numero de fila y asiento que deaseas ocupar");

                System.out.println("La fila debe estar dentro del rango 0 - 9");
                fila = sc.nextInt();

                System.out.println("Ingresa tu numero de fila y asiento que deaseas ocupar");

                System.out.println("El asiento debe estar dentro del rango 0 - 9");
                asiento = sc.nextInt();

                if (fila >= 0 && fila <= 9) {

                    if (asiento >= 0 && asiento <= 9) {

                        bandera = true;
                        
                    } else {

                        System.out.println("el asiento debe estar dentro del rango 0 - 9");

                    }
                } else {

                    System.out.println("La fila debe estar dentro del rango 0 - 9");

                }
            }

            if (sala[fila][asiento] == 'L') {

                sala[fila][asiento] = 'X';
                System.out.println("Se a registrado su selección");

            } else {

                System.out.println("El asiento ya esta ocupado");

            }

            System.out.println("¿Desea seguir reservando? S para continuar, cualquier otro caracter para salir");
            sc.nextLine();
            respuesta = sc.nextLine();

            if (!respuesta.equalsIgnoreCase("S")) {

                salir = true;
            }

        }

    }

    public static void mostrarAsientos(char[][] sala) {

        System.out.println("=================  ASIENTOS  =================== \n");

        for (int i = 0; i < sala.length; i++) {

            System.out.print(i + " ");
            for (int j = 0; j < sala.length; j++) {

                System.out.print("[" + sala[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");
    }

}
