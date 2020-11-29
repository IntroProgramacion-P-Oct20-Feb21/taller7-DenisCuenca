/*
*/
package ejemplos07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       var  bandera = "";
        String salir;
        
        do {
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();// si SI Si
            salir = salir.toLowerCase();//la cadena siempre se convierte a minusculas = si SI Si
              //if(salir.equals("si")){
              //  bandera = false;
            }
        } while (bandera.equals("si"));
        
        
    }
}
