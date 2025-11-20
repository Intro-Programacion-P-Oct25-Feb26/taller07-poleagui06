/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Pole
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double contador = 0;
        double resultado = 0;
        int numerador = 1;
        int contadorSigno = 1;
        String signo = "";
        String mensaje = "";

        while (contador <= 15) {
            if (contadorSigno % 2 == 0) {
                signo = "-";
            } else {
                signo = "+";
            }
            resultado = (contador + 1);
            mensaje = String.format("%s%s%d/%.0f ", mensaje,signo,
                    numerador, resultado);            
            contador = contador + 2;
            contadorSigno = contadorSigno + 1;


        }
        System.out.printf("%s", mensaje); // TODO code application logic here
    }

}
