/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpets;

/**
 *
 * @author Usuario
 */
public class Mamifero extends Animal {
    protected String corPelo;

    @Override
    public void locomover(){
        System.out.println("O mamifero esta correndo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("O mamifero esta mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O mamifero esta emitindo seu som");
    }
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
