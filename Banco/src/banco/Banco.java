/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Usuario
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(0001);
        
        c1.setDono("Luis");
        
        
        
        c1.informacao();
    }
    
}
