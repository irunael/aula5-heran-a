package entidades;

public class ContaPoupanca extends Conta {

   

	public ContaPoupanca(String nome, int numero, double saldo) {
	    super(nome, numero, saldo);
	}
       
    

    @Override
    public String toString() {
        return "ContaPoupanca [Número: " + getNumero() + ", Nome: " + getNome() + ", Saldo: " + getSaldo() + "]";
    }

    
    }
