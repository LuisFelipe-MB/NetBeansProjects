/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if((l1.getCategoria().equals(l2.getCategoria())) && (l1!=l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("a Luta foi marcada");
        }else{
            this.aprovada = false;
            this.desafiado = l1;
            this.desafiante = l2;
            cancelarLuta(this.desafiado, this.desafiante);
        }   
    }
    
    public void cancelarLuta(Lutador l1, Lutador l2){
        if(!l1.getCategoria().equals(l2.getCategoria())) {
            System.out.println("As categorias sao diferentes");
        }else{
            System.out.println("Mesmo lutador cadastrado");
        }
    }
    
    public void lutar() {
        if(this.isAprovada()) {
            System.out.println("==========RESULTADO DA LUTA===========");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
             int vencedor = aleatorio.nextInt(3); // 0 1 2
             switch(vencedor) {
                 case 0 -> {
                     // empate
                     System.out.println("---Empatou---");
                     this.desafiado.empatarLuta();
                     this.desafiante.empatarLuta();
                }
                 case 1 -> {
                     // Desafiado Ganhou
                     System.out.println(desafiado.getNome() + " GANHOU A LUTAAAA!!!!");
                     this.desafiado.ganharLuta();
                     this.desafiante.perderLuta();
                }
                 case 2 -> {
                     // Desafiante Ganhou
                     System.out.println(desafiante.getNome() + " GANHOU A LUTAAAA!!!!");
                     this.desafiado.perderLuta();
                     this.desafiante.ganharLuta();
                }
             }
             System.out.println("=======================================");
        }else {
            System.out.println("A luta nao pode acontecer");
        }
    }
    // Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
