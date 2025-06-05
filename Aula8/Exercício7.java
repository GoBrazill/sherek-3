package aula08;

import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num[] = {3, 2, 7, 8, 5};
		int multi;
		
		System.out.println("Os números do vetor são: " + num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4]);
		
		System.out.println("digite um número para multiplicar os números no vetor");
		multi = scn.nextInt();
		// fazendo a multiplição manualmente de cada elemento do vetor usando o número que o usuário disse 		
		num[0] = num [0] * multi;
		num[1] = num [1] * multi;
		num[2] = num [2] * multi;
		num[3] = num [3] * multi;
		num[4] = num [4] * multi;
		
		System.out.println("Os números do vetor são: " + num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4]);
		
		scn.close();
	}

}
