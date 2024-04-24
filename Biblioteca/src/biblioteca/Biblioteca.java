
package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Pessoa [] pess = new Pessoa[2];
        Livro[] liv = new Livro[3];
        
        pess[0] = new Pessoa("Luis", 22, 'M');
        pess[1] = new Pessoa("Fernanda", 17, 'F');
        
        liv[0] = new Livro("Aprendendo HTML5 e CSS3", "Carlos de Olinda",500, pess[0]);
        liv[1] = new Livro("Java Avancado", "Gustavo Guanabara", 700, pess[0]);
        liv[2] = new Livro("A obra de Deus em minha vida", "Carlas Simoes", 200, pess[1]);
        
        liv[0].abrir();
        liv[0].folhear(134);
        System.out.println(liv[0].detalhes());
    }
    
}
