package modulo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();

		System.out.println("Digite 5 cores:");
		for (int i = 0; i < 5; i++) {

			System.out.print("Cor " + (i + 1) + ": ");
			String cor = scanner.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);
		System.out.println("\nColocando as cores em ordem, temos:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		scanner.close();
	}
}
