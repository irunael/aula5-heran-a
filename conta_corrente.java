package entidades;

public class conta_corrente extends Conta{

	
		
	public conta_corrente(String nome, int numero, double saldo, double limite) {
	    super(nome, numero, saldo);
	    this.limite = limite;
	}

		private double limite;

		

		@Override
		public String toString() {
		    return " ContaCorrente [Número: " + getNumero() + ", Nome: " + getNome() + ", Saldo: " + getSaldo() + ", Limite: " + limite + "]";
		}

		
	}
