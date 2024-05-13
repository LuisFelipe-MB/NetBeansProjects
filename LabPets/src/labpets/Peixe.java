/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpets;

/**
 *
 * @author Usuario
 */
public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("O peixe soltou uma bolha ..OOOO..");
    }

    @Override
    public void locomover(){
        System.out.println("O peixe esta nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("O peixe esta se alimentando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe nao emite som");
    }
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
