
package aula02;


public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "laranja";
        //c1.ponta = 0,4f;
        c1.carga = 80;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
