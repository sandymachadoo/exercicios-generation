package modulo08;

import java.util.Scanner;

public class ExercicioRepetWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int idade;
		int menoresDe21 = 0;
		int maioresDe50 = 0;

		while (true) {
			System.out.print("Digite uma idade: ");
			idade = scanner.nextInt();

			if (idade < 0) {
				break;
			} else if (idade < 21) {
				menoresDe21++;
			} else if (idade > 50) {
				maioresDe50++;
			}
		}

		System.out.println("Pessoas menores de 21 anos: " + menoresDe21);
		System.out.println("Pessoas maiores de 50 anos: " + maioresDe50);

		scanner.close();
	}
}
