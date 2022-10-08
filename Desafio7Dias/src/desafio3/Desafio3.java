package desafio3;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o tamanho do vetor: ");

		int a = 0;
		while (a <= 0) {
			a = ler.nextInt();
			if (a <= 0) {
				System.out.println("\nErro! valor negativo. Tente novamente: ");
			}
		}

		int vetorTamanho[] = new int[a];
		Float mediaTotal = (float) 0;

		System.out.println("\nPreencha esse vetor com  valores inteiros: ");
		for (int i = 0; i < vetorTamanho.length; i++) {
			vetorTamanho[i] = ler.nextInt();
			mediaTotal = vetorTamanho[i] + mediaTotal;
		}

		mediaTotal = mediaTotal / a;

		System.out.printf("\nA media dos valores inteiros lidos é de: %.2f", mediaTotal);

		ler.close();
	}

}
