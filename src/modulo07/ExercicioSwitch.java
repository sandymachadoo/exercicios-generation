package modulo07;

import java.util.Scanner;

public class ExercicioSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float saldo = 1000.00f;
		int operacao;

		System.out.println("-----------------------------------");
		System.out.println("Escolha a operação desejada:");
		System.out.println("1 - Consultar saldo");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar");
		System.out.println("-----------------------------------");
		System.out.print("Digite o número da operação (1 a 3): ");
		operacao = scanner.nextInt();

		switch (operacao) {
		case 1:
			System.out.printf("Saldo atual: R$ %.2f%n", saldo);
			break;
		case 2:
			System.out.print("Digite o valor a ser depositado: R$ ");
			float valorDeposito = scanner.nextFloat();
			saldo += valorDeposito;
			System.out.printf("Novo saldo após depósito: R$ %.2f%n", saldo);
			break;
		case 3:
			System.out.print("Digite o valor a ser sacado: R$ ");
			float valorSaque = scanner.nextFloat();
			if (valorSaque <= saldo) {
				saldo -= valorSaque;
				System.out.printf("Novo saldo após saque: R$ %.2f%n", saldo);
			} else {
				System.out.println("Saldo insuficiente!");
			}
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}

		scanner.close();
	}
}
