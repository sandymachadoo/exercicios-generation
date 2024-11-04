package modulo07;

import java.util.Scanner;

public class ExercicioSwitch2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int codigoProduto;
		int quantidade;
		float preco = 0;
		String nomeProduto = "";

		System.out.println("------| Tabela de Produtos |-------");
		System.out.println("-----------------------------------");
		System.out.println("1 - Batata Frita - R$ 10.00");
		System.out.println("2 - Temaki Frito - R$ 20.00");
		System.out.println("3 - Yakisoba - R$ 30.00");
		System.out.println("4 - Bolo de Chocolate - R$ 40.00");
		System.out.println("5 - Empadão - R$ 50.00");
		System.out.println("6 - Fricassê - R$ 60.00");
		System.out.println("-----------------------------------");

		System.out.print("Digite o código do produto (1 a 6): ");
		codigoProduto = scanner.nextInt();

		System.out.print("Digite a quantidade comprada: ");
		quantidade = scanner.nextInt();

		switch (codigoProduto) {
		case 1:
			nomeProduto = "Batata Frita";
			preco = 10.00f;
			break;
		case 2:
			nomeProduto = "Temaki Frito";
			preco = 20.00f;
			break;
		case 3:
			nomeProduto = "Yakisoba";
			preco = 30.00f;
			break;
		case 4:
			nomeProduto = "Bolo de Chocolate";
			preco = 40.00f;
			break;
		case 5:
			nomeProduto = "Empadão";
			preco = 50.00f;
			break;
		case 6:
			nomeProduto = "Fricassê";
			preco = 60.00f;
			break;
		default:
			System.out.println("Código do produto inválido!");
			scanner.close();
			return;
		}

		float valorTotal = quantidade * preco;

		System.out.printf("Você comprou %d unidades de %s.%n", quantidade, nomeProduto);
		System.out.printf("Valor total: R$ %.2f%n", valorTotal);

		scanner.close();
	}
}
