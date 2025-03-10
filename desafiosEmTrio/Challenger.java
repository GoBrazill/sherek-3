package desafio;

import java.util.Random;
import java.util.Scanner;

public class Challenger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ram = new Random();
		//variaveis
		
		int adv = 0;
		int num;
		
		//entrada
		
		System.out.println("Adivinhe um número entre 0 e 10");
		num = ram.nextInt(11);
		adv = scn.nextInt();
		//processamento e saida
		
		if (adv == num) {
			System.out.println("você acertou!!");
		} else {
			System.out.println("você errou :(");
		}
		
			scn.close();
	}
    
}
