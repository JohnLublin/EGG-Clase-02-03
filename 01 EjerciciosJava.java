/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.ejercicios.java;

import java.util.Scanner;

/**
 *
 * @author jonathanlublin
 */
public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int a = 0,b = 0,suma = 0;
       
        
              
        System.out.println("Ingrese dos numeros enteros:");
        a=t.nextInt();
        b=t.nextInt();
        
        suma= a + b;
                
        System.out.println("El total de la suma entre :" + a + " y " + b + " es: " + suma);

    }
    
}
