/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema04;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Generar, imprimira y obtenga el resultado de la serie:
            1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15*/
        int contador = 1;
        int num = 1;
        int den = 1;
        double divicion;
        double diviciones = 0;
        String cadena = "";
        
        while (den <= 15) {
            divicion = (double)num / (double) den;
            if ((contador % 2) == 0) {

                cadena = String.format("%s-%s/%s ", cadena, num, den);
                diviciones -= divicion;

            } else {
                cadena = String.format("%s+%s/%s ", cadena, num, den);
                diviciones += divicion;
            }
            contador += 1;
            den += 2;
            
        }
        cadena = String.format("%s\nResultado: %.2f", cadena, diviciones);
        System.out.println(cadena);
    }

}
