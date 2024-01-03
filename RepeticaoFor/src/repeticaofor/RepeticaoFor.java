/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author Usuario
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /* Fibonacc
        int a1=1, a2=1, a3;
        System.out.print(a1 + ", " + a2);
        for (int cc=1; cc<=1;cc++) {
            a3 = a1 +a2;
            System.out.print(", " + a3);
            a1 = a2;
            a2 = a3;
            
        }*/
        //Matriz
        for(int i=1; i<=3;i+=1) {
            System.out.print("| ");
            for(int j=1; j<=3;j+=1){
                if (i<j){
                System.out.print("M ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("|");
        }
        
    }
    
    
}
