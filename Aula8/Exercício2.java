package aula8;

import java.util.Random;

public class Exercício2 {

	public static void main(String[] args) {
		Random ale = new Random();
		
		int num = 10;
		int soma;
		int vetor[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			vetor[i] = ale.nextInt(101);
			
			System.out.println(vetor[i]);
			
			soma = soma(vetor, vetor.length);
			
			System.out.println(soma);
			
				}
		
	}

	private static int soma(int[] vetor, int length) {
		// TODO Auto-generated method stub
		return 0;
	}

}
