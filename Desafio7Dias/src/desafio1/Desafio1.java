package desafio1;

public class Desafio1 {

	public static void main(String[] args) {
		char[][] vetorCaractere = new char[10][10];

		for (int i = 0; i < vetorCaractere.length; i++) {
			for (int j = 0; j < vetorCaractere.length; j++) {
				vetorCaractere[i][j] = '-';
				System.out.print(vetorCaractere[i][j]);
			}
			System.out.println();

		}

	}
}
