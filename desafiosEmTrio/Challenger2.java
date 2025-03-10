package desafio;

import java.util.Scanner;

public class Challenger2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double peso, altura, imc;

		System.out.println("vamos calcular o seu IMC :)");
		System.out.println("digite o seu peso");
		peso = scn.nextDouble();
		System.out.println("digite a sua altura: ");
		altura = scn.nextDouble();

		imc = peso / (Math.pow(altura, 2));

		if (imc < 18.5) {
			System.out.println("você está abaixo do peso " + imc);

		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("você está no peso ideal " + imc);

		} else if (imc >= 25 && imc < 30) {
			System.out.println("você está com sobrepeso " + imc);

		} else if (imc >= 30 && imc < 35) {
			System.out.println("você está com obesidade grau 1 " + imc);

		} else if (imc >= 35) {
			System.out.println("você está com obesidade grau 2 " + imc);

		} 
		scn.close();

	}

}
