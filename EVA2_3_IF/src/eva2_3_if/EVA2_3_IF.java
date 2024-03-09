/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double califa;
        System.out.println("cual es tu calificación? ");
        Scanner input = new Scanner(System.in);
        califa = input.nextDouble();
        if(califa >= 70) { //esta seccion true 
            // llaves opcionales, solo cuando tenemos una o mas instrucción
            System.out.println("aprobaste!! ");
     
        }else
            System.out.println("no acreditado, ¿que pasó master? ");
                
    }
    
}
