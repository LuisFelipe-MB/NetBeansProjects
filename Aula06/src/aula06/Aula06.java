
package aula06;


public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.maisVolume();
        
        c.abrirMenu();
    }
    
}
