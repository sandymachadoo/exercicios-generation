package modulo07;

import java.util.Scanner;

public class ExercicioIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número A: ");
		int A = scanner.nextInt();

		System.out.print("Digite o número B: ");
		int B = scanner.nextInt();

		System.out.print("Digite o número C: ");
		int C = scanner.nextInt();

		int soma = A + B;

		System.out.println(A + " + " + B + " = " + soma);

		if (soma > C) {
			System.out.println("A soma de A + B é maior que C");
		} else if (soma < C) {
			System.out.println("A soma de A + B é menor que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}

		scanner.close();
	}
}
