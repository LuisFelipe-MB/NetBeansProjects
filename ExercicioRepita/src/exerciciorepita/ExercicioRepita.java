/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Voce digitou o valor " + n);
        int n, s=0, V=0, Par=0, Imp=0, acima100=0, M;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Digite um numero: <br>"
                    + "<em>[valor 0 interrompe]</em></html>"));
            if (n!=0){
                s += n;
                V++;
                if (n % 2 == 0) {
                    Par++;
                }else {
                    Imp++;
                }
                if (n > 100) {
                    acima100++;
                }
            }    
        } while(n !=0);
        M = s/V;
        JOptionPane.showMessageDialog( null, "<html>Resultado final <hr>"
                + "Total de Valores: " + V + "<br>"
                + "Total de Pares: " + Par + "<br>"
                + "Total de Impares: " + Imp + "<br>"        
                + "Acima de 100: " + acima100 + "<br>"
                + "Media dos valores: " + M + "</html>");
       
    }
    
}
