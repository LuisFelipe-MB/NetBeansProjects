/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpets;

/**
 *
 * @author Usuario
 */
public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("O cachorro enterrou o osso");
    }
    public void abanarRabo(){
        System.out.println("O cachorro esta feliz");
    }
    @Override
    public void emitirSom(){
        System.out.println("O cachorro esta latindo");
    }
}
