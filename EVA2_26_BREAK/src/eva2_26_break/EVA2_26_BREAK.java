/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, pwd;
        
        
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        
        Scanner input = new Scanner(System.in);
        
        //como es un control de acceso, debemos preguntar
        //un numero indeterminado de veces, hasta que el usuario
        //y contraseña sean correctos.
        while(true){
            System.out.println("USUARIO:");
            usuario = input.nextLine();
            System.out.println("CONTRASEÑA:");
            pwd = input.nextLine();
            if(usuario.equals(USUARIO) && pwd.equals(PASSWORD)) //datos correctos
                break;
           
        }
        
        System.out.println("bienvenido al sistema");
    }
    
}
