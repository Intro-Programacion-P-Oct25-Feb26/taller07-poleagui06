/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;


/**
 *
 * @author Pole
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
        int resultado = 0;
        int secuencia = 2;
        String mensaje = "";
        
     while (contador <= 10){
         
        resultado = resultado + secuencia;
        secuencia = secuencia + 2;
        contador = contador + 1;     
        
        mensaje = String.format("%s%d\n", mensaje, resultado);
     
     }
        System.out.printf("%s",mensaje);
    }
    
}
