package modulo07;

import java.util.Scanner;

public class ExercicioIf2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do doador: ");
		String nome = scanner.nextLine();

		System.out.print("Digite a idade do doador: ");
		int idade = scanner.nextInt();

		System.out.print("É sua primeira doação de sangue? (true/false): ");
		boolean primeiraDoacao = scanner.nextBoolean();

		boolean aptoParaDoar;
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69 && primeiraDoacao) {
				aptoParaDoar = false;
			} else {
				aptoParaDoar = true;
			}
		} else {
			aptoParaDoar = false;
		}

		if (aptoParaDoar) {
			System.out.println(nome + " está apto para doar sangue!");
		} else {
			System.out.println(nome + " não está apto para doar sangue!");
		}

		scanner.close();
	}
}
