/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pole
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String msjFinal = "";
        int contador = 1;
        int sumaEdad = 0;
        double sumaEstatura = 0;
        int edad;
        double promEdad;
        double promEstatura;
        String listado = "";

        while (contador <= 5) {

            System.out.println("Ingrese nombre completo del jugador:");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese la posición del jugador:");
            String posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador:");
            double estatura = entrada.nextDouble();

            sumaEdad = sumaEdad + edad;
            sumaEstatura = sumaEstatura + estatura;

            contador = contador + 1;
            entrada.nextLine();

            msjFinal = String.format("\n%sListado de Jugadores\n1. %s -%s-, edad %d"
                    + ", estatura %.2f\n",
                    msjFinal,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            
            listado = String.format("%s%d\n", listado, edad);

        }

        promEdad = sumaEdad / 5;
        promEstatura = sumaEstatura / 5;
        
        System.out.printf("%s\n"
                + "Listado de Edades\n%s"
                + "Promedio de edades: %.2f\n"
                + "Promedio de estaturas: %.2f\n",
                msjFinal,
                listado,
                promEdad,
                promEstatura);

    }

}
