/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Ro de Castro
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner teclado = new Scanner (System.in); 
    System.out.println("Ingrese la cantidad de horas trabajadas en un mes y el costo de cada una ");
     int a = teclado.nextInt (); 
     int b= teclado.nextInt();
     int sm= a*b;
     int sa = sm*12;
        System.out.println("El salario mensual es $" + sm);
        System.out.println("El salario anual es $" + sa);
    }
    
    
    
}
