package modulo10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();

		System.out.println("Digite 10 números inteiros, sem repeti-los:");
		while (numeros.size() < 10) {
			System.out.print("Número " + (numeros.size() + 1) + ": ");
			int numero = scanner.nextInt();
			if (!numeros.add(numero)) {
				System.out.println("Este número está repetido! Tente novamente.");
			}
		}

		System.out.println("\nListar dados do Set:");
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		scanner.close();
	}
}
