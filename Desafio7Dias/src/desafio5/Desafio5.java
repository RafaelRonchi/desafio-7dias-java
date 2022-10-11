package desafio5;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Integer vetorUsuario[] = new Integer[5];

		System.out.println("Preencha o vetor com 5 valores:");
		for (int i = 0; i < vetorUsuario.length; i++) {
			vetorUsuario[i] = Integer.valueOf(ler.nextLine());
		}

		System.out.print("\nInforme o valor para achar: ");
		Integer checarValor = Integer.valueOf(ler.nextLine());

		for (int i = 0; i < vetorUsuario.length; i++) {
			if (vetorUsuario[i] == checarValor) {
				System.out.println("Valor encontrado na posição: " + i);
				System.exit(0);
			}
		}

		System.out.println("Nenhum valor encontrado");

		ler.close();
	}

}
