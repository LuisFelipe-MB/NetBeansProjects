/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num [] = {3, 1, 9, 0};
        for (int v:num){
            System.out.println(v);
        }
        int pos = Arrays.binarySearch(num,7);
        System.out.println("Encontrei o valor na posicao " + pos);
        
    }
    
}
