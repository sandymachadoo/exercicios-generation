package modulo09;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número que quer encontrar: ");
		int numeroDesejado = scanner.nextInt();

		boolean encontrado = false;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroDesejado) {
				System.out.println("O número " + numeroDesejado + " está na posição: " + i);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O número " + numeroDesejado + " não foi encontrado!");
		}

		scanner.close();
	}
}
