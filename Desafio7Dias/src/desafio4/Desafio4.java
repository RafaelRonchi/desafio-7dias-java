package desafio4;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Integer vetorValores[] = new Integer[10];

		System.out.println("Preencha o vetor de tamanho 10 com valores:");
		for (int i = 0; i < vetorValores.length; i++) {
			vetorValores[i] = Integer.valueOf(ler.nextLine());
		}

		System.out.print("\nInforme um valor para checar se existe no vetor: ");
		Integer valorCheck = Integer.valueOf(ler.nextLine());

		for (int i = 0; i < vetorValores.length; i++) {
			if (valorCheck == vetorValores[i]) {
				System.out.print("\nValor encontrado! Posição: " + i + " do vetor");
				System.exit(0);
			}
		}

		System.out.println("\nValor não encontrado!");

		ler.close();
	}

}
