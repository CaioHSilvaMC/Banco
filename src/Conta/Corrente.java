package Conta;

public class Corrente extends Conta{

		@Override
		public void imprimirExtrato() {
			System.out.println("Detalhes Conta Corrente");
		super.imprimirCorr();		
		}

		@Override
		public void sacar(double valor) {
			
		}

		@Override
		public void depositar(double valor) {
		
		}
}