/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        System.out.println("introduce una calificación");
        Scanner input = new Scanner(System.in);
        cali = input.nextInt();
        
        if((cali >= 90) && (cali<= 100))
            System.out.println("A de aprobaste epicamente");
        else if ((cali >= 80) && (cali<= 89))
            System.out.println("B de buena calificacion");
        else if ((cali >= 70) && (cali<= 79))
            System.out.println("C de chale, pasar es pasar");
        else if ((cali >= 60) && (cali<= 69))
            System.out.println("D de definitivamente hechale mas ganas");
        else if (cali < 60)
            System.out.println("F de firulais hace mejor los examenes que tú jjasjajsdjasdj");
        else
            System.out.println("no es una calificación valida");
    }
    
}
