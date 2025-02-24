package aula1;

import java.util.Scanner;

public class ImprimaOMaiorNúmero {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		double num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = scn.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		num2 = scn.nextDouble();
		
		if (num1 > num2) System.out.println(num1 + " é o maior número");
		
		else if (num2 > num1) System.out.println(num2 + " é o maior número");
		
		scn.close();

	}

}
