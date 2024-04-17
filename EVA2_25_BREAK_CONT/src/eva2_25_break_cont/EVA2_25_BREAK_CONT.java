/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_25_break_cont;

/**
 *
 * @author invitado
 */
public class EVA2_25_BREAK_CONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 100; i++) {
            int mod = i % 2;
            if(mod != 0)//queremos los casos que sean pares 
                continue; // cuando se ejecuta, iteración actual 
            
            System.out.println(i);
            
            
        }
        System.out.println("break: -----------------------------");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if(i == 50)
                break;
            
        }
    }
    
    
}
