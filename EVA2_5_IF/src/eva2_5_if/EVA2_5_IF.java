/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //capturar temperatura
        int temp; 
        Scanner input = new Scanner(System.in);
        System.out.println("temperatura (°C): ");
        temp = input.nextInt();
        //si la temperatura es mayor a 22°, se enciende el clima 
        if (temp > 22) {
            System.out.println("aire prendido");
            
        
        }
    }
    
}




        