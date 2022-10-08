package desafio2;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Float soma = (float) 0;
		Float vet[] = new Float[10];
		
		System.out.println("Preencha os 10 valores do vetor: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Float.valueOf(ler.nextLine());
			soma = vet[i] + soma;
		}

		System.out.printf("A soma dos elemelentos do vetor é de: %.2f ", soma);

		ler.close();

	}

}
