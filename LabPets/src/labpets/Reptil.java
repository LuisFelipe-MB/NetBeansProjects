/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpets;

/**
 *
 * @author Usuario
 */
public class Reptil extends Animal{
    
    protected String corEscama;

    @Override
    public void locomover(){
        System.out.println("O Reptil esta se rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("O reptil esta comendo vegetais");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O reptil esta emitindo seu som");
    }
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
