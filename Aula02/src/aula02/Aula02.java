
package aula02;


public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.7f;
        c1.carga = 5;        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        
        Caneta c2 = new Caneta();
        c2.modelo = "Fabri-castel";
        c2.cor = "Vermelha";
        c2.ponta = 0.5f;
        c2.carga = 10;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
