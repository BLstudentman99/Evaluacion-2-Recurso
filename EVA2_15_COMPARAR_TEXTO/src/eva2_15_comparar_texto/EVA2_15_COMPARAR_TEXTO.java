/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_15_COMPARAR_TEXTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // comparar texto en java.
        String dia;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce el dia. (Lunes, martes etc.");
        dia = input.nextLine();
        
        if(dia.equals("domingo"))
            System.out.println("1");
        else if(dia.equals("lunes"))
            System.out.println("2");
        else if(dia.equals("martes"))
            System.out.println("3");
        else if(dia.equals("miercoles"))
            System.out.println("4");
        else if(dia.equals("jueves"))
            System.out.println("5");
        else if(dia.equals("viernes"))
            System.out.println("6");
        else if(dia.equals("sabado"))
            System.out.println("7");
        else
            System.out.println("no es un dia valido");
        
        
        
    }
    
}
