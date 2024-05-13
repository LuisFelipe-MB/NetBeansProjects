/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpets;

/**
 *
 * @author Usuario
 */
public class Ave extends Animal{
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("A ave fez um ninho para seus filhotes");
    }
    
    @Override
    public void locomover(){
        System.out.println("A ave esta voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("A ave esta se alimentando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("A ave esta emitindo seu som");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
