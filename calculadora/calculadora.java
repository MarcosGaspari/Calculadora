/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class calculadora {
    public static void main(String[] args){ 
       Scanner entrada = new Scanner(System.in); 
       double n1, n2, soma, sub, mult, div; 
       int op; 
 
       System.out.println("Primeiro valor: "); 
       n1 = entrada.nextDouble(); 
 
        System.out.println("Segundo valor: "); 
       n2 = entrada.nextDouble(); 
 
       System.out.println("1 Soma"); 
       System.out.println("2 Subtracao"); 
       System.out.println("3 Multiplicacao"); 
       System.out.println("4 Divisao"); 
       op = entrada.nextInt(); 
 
       switch(op) { 
           case 1 -> {
               soma = n1 + n2;
               System.out.println("Resultado: "+soma);
            } 
 
           case 2 -> {
               sub = n1 - n2;
               System.out.println("Resultado: "+sub);
            } 
 
           case 3 -> {
               mult = n1 * n2;
               System.out.println("Resultado: "+mult);
            } 
 
           case 4 -> {
               if( n1<n2){
                   System.out.println("Operacao invalida");
               } else{
                   div = n1/n2;
                   System.out.println("Resultado: "+div);
               }
            } 
 
           default -> System.out.println("Operacao invalida"); 
       } 
 
    } 
}
