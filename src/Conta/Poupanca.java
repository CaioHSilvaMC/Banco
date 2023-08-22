package Conta;

public class Poupanca extends Conta{

		@Override
		public void imprimirExtrato() {
			System.out.println("Detalhes Conta Poupança");
		super.imprimirPou();
		}

		@Override
		public void sacar(double valor) {
			
		}

		@Override
		public void depositar(double valor) {
			
		}
}