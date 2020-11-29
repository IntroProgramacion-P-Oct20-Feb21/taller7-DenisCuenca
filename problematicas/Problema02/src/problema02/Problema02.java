/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 2;
       int aumento = 4;
        String cadena= "";
        while (contador <= 110){
         cadena = String.format("%s%s ",cadena,contador);
        contador+=aumento;
        aumento+=2;
        } 
        System.out.printf("%s",cadena);
    }
    
}
