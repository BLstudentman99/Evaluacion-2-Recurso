/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        System.out.println("introduce el dia de la semana con numero del 1 al 7");
        Scanner input = new Scanner(System.in);
        dia = input.nextInt();
        
        if(dia == 1)
            System.out.println("Domingo");
        else if (dia == 2)
            System.out.println("lunes");         
        else if (dia == 3)
            System.out.println("martes");         
        else if (dia == 4)
            System.out.println("miercoles");         
        else if (dia == 5)
            System.out.println("jueves");         
        else if (dia == 6)
            System.out.println("viernes");         
        else if (dia == 7)
            System.out.println("sabado");
        else //opcional
            System.out.println("el numero introducido no es valido");
         
    }
    
}
