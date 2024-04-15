/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_23_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 5; //numero que tiene que adivinar(entre 1 y 10)
        int valor = 0; //valor para almacenar lo que capture el usuario
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Adivina el numero entre 1 y 10:");
            valor = input.nextInt();
        }while(num != valor);
        System.out.println("ganaste pa");
        
    }
    
}
