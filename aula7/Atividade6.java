package aula7;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Double num1, num2, div;
		
		System.out.println("digite um número: ");
		num1 = scn.nextDouble();
		
		System.out.println("Por quanto quer dividir esse número");
		num2 = scn.nextDouble();
		
		div = num1 / num2;
		
		if (div == 0)  System.out.println("Não se pode dividr por 0"); 
		
		else System.out.println("Não se pode dividr por 0");
		
		scn.close();
	}
}
