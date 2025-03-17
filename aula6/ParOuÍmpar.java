package aula6;

import java.util.Scanner;

public class ParOuÍmpar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Olá Usuário!!!/ digite um número para saber se ele é ímpar ou par: ");
		num = scn.nextInt();
		
		while (true) {
			if (num%2 == 0)
				System.out.println("esse número é par :D");
			else System.out.println("Esse número é ímpar :O");
		}
			

	}

}
