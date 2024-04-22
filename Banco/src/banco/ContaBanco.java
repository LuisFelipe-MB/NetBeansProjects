
package banco;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    
    public void informacao() {
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        if(!this.isStatus()) {
            System.out.println("Conta inativa");
        } else {
            System.out.println("Conta ativa");
        }
    }
    
    //Metodos personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)) {
            this.setSaldo(50f);
        } else if("CP".equals(t)){
            this.setSaldo(150f);
        }
    }
    public void fecharConta() {
        if(this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("A conta foi fechada");
        } else {
            System.out.println("A conta possui saldo ou saldo devedor");
        }
    }
    public void depositar(float v) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(float v) {
        if(this.isStatus()){
            if(this.getSaldo() >= 0) {
                this.setSaldo(this.getSaldo() - v);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel sacar! Conta inexistente");
        }
    }
    public void pagarMensal() {
        float v;
        if("CC".equals(this.getTipo())) {
            v = 12;
        }else {
            v = 20;
        }
        if(this.isStatus()) {
            if(this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel pagar");
        }
    }

    //Metodos Especiais
    public ContaBanco() { //Construtor
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
