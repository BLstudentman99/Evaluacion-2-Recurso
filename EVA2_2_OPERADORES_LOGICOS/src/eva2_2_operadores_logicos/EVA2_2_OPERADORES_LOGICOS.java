/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_operadores_logicos;

/**
 *
 * @author invitado
 */
public class EVA2_2_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean A, B;
        A = true;
        B = false; 
        boolean resu;
        //operador and --> &&     
        //verdadero, falso = falso
        resu = A && B;
        System.out.println("Resu = " + resu);
        //Verdadero, verdadero = verdadero
        A = true;
        B = true; 
        resu = A && B;
        System.out.println("Resu = " + resu);  
        //falso, falso = falso
        A = false;
        B = false; 
        resu = A && B;
        System.out.println("Resu = " + resu);
        
        //operador or
        A= false;
        B= false; 
        resu = A || B; 
        System.out.println("Resu (or) = " + resu);
        //verdero o falso = verdadero (or)
        A= true;
        B= false; 
        resu = A || B; 
        System.out.println("Resu (or) = " + resu);
        
        //Negación --> !
        A = false;
        resu = !A;
        System.out.println("Resu (!) = " + resu);
       
        A = true;
        resu = !A;
        System.out.println("Resu (!) = " + resu);
       
                       
           
        }
    }
    
