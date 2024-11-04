package modulo11;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {
	public static void main(String[] args) {
		Stack<String> ExercicioPilha = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("*************************************");
			System.out.println("Menu:");
			System.out.println("1: Adicionar livro na pilha");
			System.out.println("2: Listar todos os livros");
			System.out.println("3: Retirar livro da pilha");
			System.out.println("0: Sair");
			System.out.println("*************************************");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				String livro = scanner.nextLine();
				ExercicioPilha.push(livro);
				System.out.println("Livro \"" + livro + "\" adicionado.");
				break;

			case 2:
				if (ExercicioPilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Lista de livros na pilha:");
					for (String l : ExercicioPilha) {
						System.out.println(l);
					}
				}
				break;

			case 3:
				if (ExercicioPilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String livroRemovido = ExercicioPilha.pop();
					System.out.println("O livro \"" + livroRemovido + "\" foi retirado da pilha.");
				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;
			}
		} while (opcao != 0);

		scanner.close();
	}
}
