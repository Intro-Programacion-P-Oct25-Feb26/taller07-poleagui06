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
        int contador = 0;
        int denominador = 1;
        
        double resultado = 0;
        double valor;
        
        String mensaje = "";
        boolean positivo = true; // al ser true se suma


        while (contador < 8) {
            valor = 1.0 / denominador;
            if (positivo) { // aqui se sumaria el valor
                resultado = resultado + valor;
                if (contador == 0){
                mensaje = "1";
                } else{
                mensaje = String.format("%s + 1/%d", mensaje, denominador);            
                  }
                
            } else { // aqui se resta el valor
                resultado = resultado - valor;
                mensaje = String.format("%s - 1/%d", mensaje, denominador);
              }
            denominador = denominador + 2;
            positivo = positivo != true; // esto altera los signos en cada cada cadena
            contador = contador + 1;
        }
        System.out.printf("%s = %.5f%n", mensaje, resultado); // TODO code application logic here
    }

}
