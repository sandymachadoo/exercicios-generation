package modulo08;

import java.util.Scanner;

public class ExercicioDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;
		int somaPositivos = 0;

		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();

			if (numero > 0) {
				somaPositivos += numero;
			}
		} while (numero != 0);

		System.out.println("Somando todos os números positivos, temos: " + somaPositivos);
		scanner.close();
	}
}
