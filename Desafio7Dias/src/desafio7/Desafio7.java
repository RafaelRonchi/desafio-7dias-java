package desafio7;

import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer vetorNumeros[] = new Integer[5];

		System.out.println("Preencha o vetor com 5 variaveis do tipo Inteiro: ");
		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = Integer.valueOf(ler.nextLine());
		}

		Integer menor = vetorNumeros[0];
		Integer maior = vetorNumeros[0];

		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] > maior) {
				maior = vetorNumeros[i];
			} else if (vetorNumeros[i] < menor) {
				menor = vetorNumeros[i];
			}
		}

		System.out.println("Menor valor: " + menor + " Maior valor: " + maior);

		ler.close();
	}

}
