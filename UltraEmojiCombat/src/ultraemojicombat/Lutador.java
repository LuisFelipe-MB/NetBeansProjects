 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author Usuario
 */
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empates;
    
    //Construtor
    public Lutador(String no, String na, int id, 
                    float al, float pe, int vit, int der, int emp){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vit;
        this.derrota = der;
        this.empates = emp;
        
    }
    
    //Métodos
    
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou " + this.getVitoria());
        System.out.println("Perdeu " + this.getDerrota());
        System.out.println("Empatou " + this.getEmpates());
    }
    
    public void status(){
        System.out.println(this.getNome());
        System.out.println("eh um peso " + this.getCategoria());
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    //Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso <= 52.2) {
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }
    
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
