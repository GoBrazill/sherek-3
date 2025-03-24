package aula7;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//variáveis
		double n1, n2, n3, media;

		//entrada

		System.out.println("Digite a nota 1: ");
		n1 = input.nextDouble();

		System.out.println("Digite a nota 2: ");
		n2 = input.nextDouble();

		System.out.println("Digite a nota 3: ");
		n3 = input.nextDouble();

		media = (n1 + n2 + n3) / 3;

		//saída
		
		if (media >= 7) 
			System.out.println("Aprovado!");
		
		else if (media <= 6)
			System.out.println("Reprovado! Média: " + media);
		
		input.close();
	}
}
