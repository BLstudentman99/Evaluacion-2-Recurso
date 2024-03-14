/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_operadores_logicos;

/**
 *
 * @author invitado
 */
public class EVA2_11_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean hayDinero, hayBuenClima;
        //para hacer carne asada se necesita que haya dinero y que haya buen clima 
        hayDinero = false; 
        hayBuenClima = false;
        
        System.out.println("1.NO HAY DINERO Y NO HAY BUEN CLIMA!");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se hace la carne!");
        else
            System.out.println("Huevito!");
        
        hayDinero = false; 
        hayBuenClima = true;
        
        System.out.println("2.NO HAY DINERO Y HAY BUEN CLIMA!");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se hace la carne!");
        else
            System.out.println("Huevito!");
        
        hayDinero = true; 
        hayBuenClima = false;
        
        System.out.println("3.HAY DINERO Y NO HAY BUEN CLIMA!");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se hace la carne!");
        else
            System.out.println("Huevito!");
        
        hayDinero = true; 
        hayBuenClima = true;
        
        System.out.println("1.HAY DINERO Y HAY BUEN CLIMA!");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se hace la carne!");
        else
            System.out.println("Huevito!");
        
               
    }
    
}
