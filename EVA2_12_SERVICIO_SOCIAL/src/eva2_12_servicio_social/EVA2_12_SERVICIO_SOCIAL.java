/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_SERVICIO_SOCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int creditos;
        int semestre;
        Scanner input = new Scanner(System.in);
        System.out.println("que semestre cursas? ");
        semestre = input.nextInt();
        System.out.println("cuantos creditos tienes? ");
        creditos = input.nextInt();
        //indicar si se puede o no realizar servicio social
        //ir en sexto semestre o superior
        //tener al menos 150 creditos
        
        if(creditos >= 150 && semestre >= 6)
            System.out.println("puedes cursar servicio social!");
        else
            System.out.println("no puedes cursar servicio social!");
    }
    
}
