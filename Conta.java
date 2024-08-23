package entidades;

public class Conta {

    protected int numero;
    private String nome;
    private double saldo;

    public Conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void imprimir() {
        System.out.println("Número: " + getNumero());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: R$ " + getSaldo());
    }

    public String mostrar() {
        return " O nome é " + nome + " O saldo é " + saldo;
    }
}