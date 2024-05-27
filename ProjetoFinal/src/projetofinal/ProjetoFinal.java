
package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de Java");
        v[1] = new Video("Aula 04 de C#");
        v[2] = new Video("Aula 02 de POO");
        
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubiscleitom", 22, "M", "jubibi");
        g[1] = new Gafanhoto("Mariana", 17, "F", "marimari");
       
        Visualizacao vis[] = new Visualizacao[5]; 
        
        vis[0]= new Visualizacao(g[0], v[1]);//Jubiscleitom
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        System.out.println("------------------------------------");
        vis[1] = new Visualizacao(g[0], v[2]);//Jubiscleitom
        vis[1].avaliar(10);
        System.out.println(vis[1].toString());
        System.out.println("------------------------------------");
        vis[2] = new Visualizacao(g[1], v[1]);//Mariana
        vis[2].avaliar(55f);
        System.out.println(vis[2].toString());
        System.out.println("------------------------------------");
    }
    
}
