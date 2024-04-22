/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author Usuario
 */
public class ControleRemoto implements Controlador {
    //Atributos:
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume(){
        return volume;
    }
    private boolean isLigado() {
        return ligado;
    }
    private boolean isTocando(){
        return tocando;
    }
    private void setVolume(int v){
        this.volume = v;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
    
    //Métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
            System.out.println("-------Menu------");
            System.out.println("Esta ligado? " + this.isLigado());
            System.out.println("Esta tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());
            for(int i=0; i<= this.getVolume(); i +=10 ) {
                System.out.print("|");
            }
            System.out.println("");
        }else{
            System.out.println("Nao esta ligado");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()){
            System.out.println("Fechando Menu");
        }else{
            System.out.println("Impossivel , o aparelho nao esta ligado");
        } 
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
    
    
}
