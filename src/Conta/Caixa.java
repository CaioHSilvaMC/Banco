package Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class Caixa {
	
	public static void main(String[] args) {
		Conta corr = new Corrente();
		Conta pou = new Poupanca();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira sua senha:");
		int senha = scanner.nextInt();
		
		if (senha == 1234) {
			System.out.println("Qual conta deseja usar?");
			System.out.println("1- Corrente");
			System.out.println("2- Poupança");
			int conta = scanner.nextInt();
		
			if (conta == 1) {
				corr.imprimirExtrato();
				System.out.println("O que deseja fazer?");
				System.out.println("1- Sacar");
				System.out.println("2- Depositar");
				System.out.println("3- Sair");
				int escolha = scanner.nextInt();
				
				switch (escolha) {
				case 1: 
					System.out.println("Digite quanto será sacado:");
					corr.sacarCorr(scanner.nextBigDecimal());
					System.out.println("Valor restante: " + corr.getSaldoCorr());
				break;
			
				case 2:
					System.out.println("Digite quanto será depositado:");
					corr.depositarCorr(scanner.nextBigDecimal());
					System.out.println("Saldo: " + corr.saldoCorr);
				break;
				
				case 3:
					System.out.println("Encerrando...");
				break;
				
				default:
					extracted();
				}
			}
		
			if (conta == 2) {
				pou.imprimirExtrato();
				System.out.println("O que deseja fazer?");
				System.out.println("1- Sacar");
				System.out.println("2- Depositar");
				System.out.println("3- Rendimento");
				System.out.println("4- Sair");
				int escolha2 = scanner.nextInt();
				
				switch (escolha2) {
				case 1: 
					System.out.println("Digite quanto será sacado:");
					pou.sacarPou(scanner.nextBigDecimal());
					System.out.println("Valor restante: " + pou.saldoPou);
					break;
		
				case 2:
					System.out.println("Digite quanto será depositado:");
					pou.depositarPou(scanner.nextBigDecimal());
					System.out.println("Saldo: " + pou.saldoPou);
					break;
			
				case 3:
					System.out.println("Digite seu Rendimento: ");
					pou.render(scanner.nextBigDecimal());
					System.out.println("Rendimento do mês: " + pou.saldoPou);
				break;
				
				case 4:
					System.out.println("Encerrando...");
					break;
				
				default:
					extracted();
				}
			}
		}
		else {
			System.out.println("Senha incorreta");
		}
		scanner.close();
	}

	private static void extracted() {
		throw new IllegalArgumentException("Inválido...");
	}
}