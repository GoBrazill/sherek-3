package aula8;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		

		int vetor[] = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("digite o número " + i);
			vetor[i] = scn.nextInt();
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf(vetor[i] + ", ");
		}
		
		scn.close();
	}

}
