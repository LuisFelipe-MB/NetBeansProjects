/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author Usuario
 */
public class Aula11 {

    public static void main(String[] args) {
        
       /* Visitante v1 = new Visitante();
        v1.setNome("Genivaldo");
        v1.setIdade(30);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());*/
        
        /*Aluno a1 = new Aluno();
        a1.setNome("Kaka");
        a1.setIdade(20);
        a1.setSexo("Masculino");
        a1.setMatricula(4749);
        a1.setCurso("Informatica");
        System.out.println(a1.toString());
        a1.pagarMensalidade();*/
        
        /*Bolsista b1 = new Bolsista();
        b1.setNome("Cascavel");
        b1.setIdade(15);
        b1.setSexo("Feminino");
        b1.setMatricula(1231);
        b1.setBolsa(45.8f);  
        b1.setCurso("Administracao");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        b1.renovarBolsa();*/
        
        /*Tecnico t1 = new Tecnico();
        t1.setNome("Gustavo");
        t1.setIdade(23);
        t1.setSexo("Masculino");
        t1.setCurso("Manutencao");
        t1.setMatricula(7777);
        t1.setRegistroProfissional(3333);
        t1.praticar();
        t1.pagarMensalidade();
        System.out.println(t1.toString());*/
        
        Professor prof1 = new Professor();
        prof1.setNome("Henrique");
        prof1.setIdade(45);
        prof1.setSexo("Masculino");
        prof1.setEspecialidade("Geografia");
        prof1.setSalario(3300f);
        prof1.receberAumento(800f);
        System.out.println(prof1.toString());
        
    }
    
}
