/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial01;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fatorial01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = teclado.nextInt();
        int C = 1;
        int a = 1;
        
        System.out.println("O fatorial de " +  num );
        while (C <= num) {
            a *= C;
            C++;
        }
        System.out.println(a);
    }
    
}
