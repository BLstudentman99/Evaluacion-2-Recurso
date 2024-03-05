/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_operadores;

/**
 *
 * @author invitado
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES ARITMETICOS
        //SUMA +, RESTA - MULTIPLICACIÓN*, DIVISION /
        
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2; //operador suma
        //Si en el operador + uno de los terminos es una cadena
        //todo se convierte a cadena de texto y se une.
        //concatenación: unión de cadenas.
        System.out.println("La suma de 5 + 3 es: " + suma);
        boolean prueba = true;
        System.out.println("El valor de prueba es: " + prueba);
        
        ////Multiplicación
        int multi;
        multi = num1 * num2;
        System.out.println("La multiplicación de 5 por 3 es: " +multi);
        
        //división
        int divi = 7 / 2;
        System.out.println("La division de 7 entre 2 es: " + divi);
        
        double diviDouble = 7 / 2.0;
        System.out.println("La division Double de 7/2.0 es: " + diviDouble);
        
        //ACUMULADORES
        //SUMA +=, RESTA -= MULTIPLICACIÓN *=, DIVISION /= 
        int sumatoria = 0; 
        /*sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80; 
        sumatoria = sumatoria + 80;*/ 
        
        sumatoria += 90; //agrega 90 a sumatoria
        sumatoria += 80; //agrega 80 a sumatoria
        sumatoria += 80; //agrega 80 a sumatoria
        
        System.out.println("la sumatoria de calificaciónes es: " +sumatoria);
        
        sumatoria -= 70; //resta 70 a sumatoria
        //sumatoria = sumatoria - 70; 
        System.out.println("la sumatoria de califiaciónes es: " + sumatoria);
        
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("MultiAcum = " + multiAcum);
        multiAcum *= 5;
        System.out.println("MultiAcum = " + multiAcum);
               
       
        
                
    }
    
}
