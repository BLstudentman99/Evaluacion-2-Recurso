/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bisiesto;
        System.out.println("introduce el año");
        Scanner input = new Scanner(System.in);
        bisiesto = input.nextInt();
        
        if(bisiesto % 100 != 0)
            if(bisiesto % 4 == 0)
                System.out.println("bisiesto");
        else
                System.out.println("No bisiesto");
        else if (bisiesto % 400 == 0)
            System.out.println("bisiesto");
        else
            System.out.println("no bisiesto");
       
            
        
    
        
    }
    
}
