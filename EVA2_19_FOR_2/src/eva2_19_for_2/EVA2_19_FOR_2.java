/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Preguntar: cantidad estudiantes en el grupo
        int cantGroup;
        Scanner input = new Scanner(System.in);
        System.out.println("¿cuantos estudiantes tiene el grupo?");
        cantGroup = input.nextInt();
        //hay que capturar todas las calificaciónes:
        for (int i = 1; i <= cantGroup; i++) {
            System.out.println("calificación: "); 
            int califa = input.nextInt();
            
        }
    }
    
}
