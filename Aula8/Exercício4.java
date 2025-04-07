package aula8;

public class Exercício4 {

	public static void main(String[] args) {
		
		int vetor [] = {5, 7, 8, 12, 20, 15, 16, 30, 26, 2, 32, 1, 9, 3, 10};

		for (int i = 0; i < vetor.length; i++) {
			
			int resto = vetor[i] % 2;
			
			if (resto == 0) {
				System.out.println(vetor[i]);
			}
		}
		
	}

}
