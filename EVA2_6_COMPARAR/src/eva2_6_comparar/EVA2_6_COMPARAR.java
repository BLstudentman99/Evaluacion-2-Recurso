/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_COMPARAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cual es el mayor valor entre dos números.
        //pedir al usuario dos enteros.
        int valor1;
        int valor2;
        Scanner input = new Scanner(System.in);
        System.out.println("primer numero: ");
        valor1 = input.nextInt();
        System.out.println("segundo numero: ");
        valor2 = input.nextInt();
        
        if(valor1 > valor2)
            System.out.println(valor1 + " " + "es mayor");
        else{ 
            if(valor1 == valor2)
                System.out.println("ambos valores son iguales ");       
            else
             System.out.println(valor2 + " " + "es mayor");
        
        }
           
    
      
    
    }
        
    }
    

