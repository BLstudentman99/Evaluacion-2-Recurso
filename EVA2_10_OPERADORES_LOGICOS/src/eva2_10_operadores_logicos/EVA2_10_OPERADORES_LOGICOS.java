/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda; 
        int caras;
        Scanner input = new Scanner(System.in);
        System.out.println("Cara(0) o cruz(1)");
        caras = input.nextInt();
        moneda = Math.random();
        System.out.println("el valor de la moneda = " + moneda);
        
        //0.5 es la mitad de rango. > 0.5 cara, menor es cruz
        if(moneda > 0.5 && caras == 0)
            System.out.println("ganaste, cara");
        else
            if(moneda <= 0.5 && caras == 1)
                System.out.println("gansate, cruz");
            else
                System.out.println("persite!");
 
        
       
    }
    
}
 
    

