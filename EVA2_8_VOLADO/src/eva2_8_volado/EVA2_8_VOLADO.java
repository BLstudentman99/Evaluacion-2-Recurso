    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_volado;

import jdk.nashorn.internal.objects.NativeRegExp;

/**
 *
 * @author invitado
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //numero aleatoio en Java: valores entre 0 y 1 
        double moneda; 
        moneda = Math.random();
        System.out.println("el valor de la moneda = " + moneda);
        
        //0.5 es la mitad del rango  
        if(moneda > 0.5)
            System.out.println("cara");
        else
            System.out.println("cruz");
        
    }
    
}
