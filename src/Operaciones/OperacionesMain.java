/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class OperacionesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero que se guardara en valor 1");
        int valor1 = sc.nextInt();
        System.out.println("");
        System.out.println("Ingrese un numero que se guardara en valor 2");
        int valor2 = sc.nextInt();
        
        Operaciones valores = new Operaciones (valor1, valor2);
        valores.ImprimeResultado();
        
        
    }
    
}
