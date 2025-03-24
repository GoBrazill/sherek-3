package aula7;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = scn.nextInt();
		
		if (num <= 20) 
			System.out.println("Esse número está no range A");
		
		else if (num <= 30)
			System.out.println("Esse número está no range B");
		
		else if (num <= 40)
			System.out.println("Esse número está no range C");

	}

}
