package modulo06;

import java.util.Scanner;

public class ExerciciosJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o Salário: ");
		float salario = scanner.nextFloat();

		System.out.print("Digite o Abono: ");
		float abono = scanner.nextFloat();

		float salarioAtualizado = salario + abono;

		System.out.println("Novo Salário: " + salarioAtualizado);

		scanner.close();
	}
}
