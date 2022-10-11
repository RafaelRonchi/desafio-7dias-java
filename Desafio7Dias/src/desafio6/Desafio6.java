package desafio6;

import java.util.Scanner;
import java.util.Random;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();

		Integer vetorNumeros[] = new Integer[5];
		String vetorString[] = new String[5];

		int sorteioNumero = random.nextInt(5);
		int sorteioString = random.nextInt(5);

		System.out.println("Preencha o vetor com 5 variaveis do tipo String: ");
		for (int i = 0; i < vetorString.length; i++) {
			vetorString[i] = ler.nextLine();
		}

		System.out.println("Preencha o vetor com 5 variaveis do tipo Inteiro: ");
		for (int i = 0; i < vetorString.length; i++) {
			vetorNumeros[i] = Integer.valueOf(ler.nextLine());
		}

		System.out.println("Numero do vetor inteiro sorteado: " + vetorNumeros[sorteioNumero]);
		System.out.println("Numero do vetor string sorteado: " + vetorString[sorteioString]);

		ler.close();
	}

}
