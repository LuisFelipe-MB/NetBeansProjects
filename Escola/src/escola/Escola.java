/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;

/**
 *
 * @author Usuario
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cladio");
        p4.setNome("Fabiana");
        
        p2.setCurso("Informatica");
        p3.setSalario(2505.75f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println("______________________\n");
        System.out.println(p2.toString());
        System.out.println("______________________\n");
        System.out.println(p3.toString());
        System.out.println("______________________\n");
        System.out.println(p4.toString());
         
    }
    
}
