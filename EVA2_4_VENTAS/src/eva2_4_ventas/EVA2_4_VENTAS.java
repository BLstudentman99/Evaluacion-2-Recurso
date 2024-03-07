/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int cantidad;
           int cantSald;
        System.out.println("cuantas piezas quieres comprar? ");
        Scanner input = new Scanner(System.in);
        cantidad = input.nextInt();
        if(cantidad > 1000) {
            cantSald = cantidad * 500;
            System.out.println("te cobro: " + cantSald );
     
        }else
            cantSald = cantidad * 800;
            System.out.println("te cobro: " + cantSald);
                
    }
    
}
    }
    
}
