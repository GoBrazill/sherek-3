package aula7;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1;
		
		System.out.println("digite um número");
		num1 = scn.nextInt();
		
		for (int i = 1 ; i <= 5 ; i++) {
			num1 = num1 * num1;
			  System.out.println(i);

		}
	}

}
