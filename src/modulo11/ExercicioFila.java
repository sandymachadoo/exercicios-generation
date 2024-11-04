package modulo11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue<String> ExercicioFila = new LinkedList<>();
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("*************************************");
			System.out.println("Menu:");
			System.out.println("1: Adicionar cliente na fila");
			System.out.println("2: Listar todos os clientes");
			System.out.println("3: Retirar cliente da fila");
			System.out.println("0: Sair");
			System.out.println("*************************************");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do novo cliente: ");
				String nomeCliente = scanner.nextLine();
				ExercicioFila.add(nomeCliente);
				System.out.println("Cliente adicionado.");
				break;

			case 2:
				System.out.println("Lista de clientes na fila:");
				if (ExercicioFila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					for (String cliente : ExercicioFila) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (ExercicioFila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String clienteChamado = ExercicioFila.poll();
					System.out.println("Cliente chamado: " + clienteChamado);
				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;

			}
		}

		scanner.close();
	}
}
