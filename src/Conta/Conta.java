package Conta;

import java.math.BigDecimal;

/**
 * 
 */
public abstract class Conta implements IConta{
	
	 private static final int AGENCIA_PADRAO = 1;

		protected int agencia;
		protected int numero = 999;
		protected BigDecimal saldoCorr = new BigDecimal(50);
		protected BigDecimal saldoPou = new BigDecimal(1000);
		
		public Conta() {
			this.agencia = Conta.AGENCIA_PADRAO;
		}
		

	public void sacarCorr (BigDecimal valor) {
		saldoCorr.subtract(valor);
		}


	public void depositarCorr (BigDecimal valor) {
		saldoCorr.add(valor);	
	}
	
	public void sacarPou (BigDecimal valor) {
		saldoCorr.subtract(valor);
		}


	public void depositarPou (BigDecimal valor) {
		saldoCorr.add(valor);	
	}
	
	public void render (BigDecimal rendi) {
		saldoPou.multiply(rendi);
	}

	protected void imprimirCorr() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldoCorr));
	}
	
	protected void imprimirPou() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldoPou));
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public BigDecimal getSaldoCorr() {
		return saldoCorr;
	}


	public void setSaldoCorr(BigDecimal saldoCorr) {
		this.saldoCorr = saldoCorr;
	}


	public BigDecimal getSaldoPou() {
		return saldoPou;
	}


	public void setSaldoPou(BigDecimal saldoPou) {
		this.saldoPou = saldoPou;
	}
		
	
}