/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg03;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class Lecture03 {
    
    private static final int CONSTANT_VALUE = 50;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read int value

        Scanner keyboardReader = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int number = keyboardReader.nextInt();
        System.out.println("");

        System.out.println("Usted digito el numero [" + number + "]");
        
        if(number > CONSTANT_VALUE){
            System.out.println("El valor digitado es mayor que la constante");
        }else{
            System.out.println("El valor digitado no es mayor que la constante");
        }
        
        for(int i=number; i>0; i--){
            System.out.print(i+" ");
        }
        
        System.out.println("");
        
        int resultado=0;
        
        if(number%2 ==0){
            resultado = number/3;
        }else{
            resultado = number%2;
        }
        
        int result = (number%2 ==0) ? number/3 : number%2;
        
    }

}
