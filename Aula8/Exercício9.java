package aula08;

import java.util.Scanner;

public class Exercício9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int nums [] = {10, 5, 8, 22, 13, 17, 30, 26, 35, 57};
		// falando que os vetores tem o mesmo tamanho do vetor nums para poder me referir a cada elemento dentro deles
		// e assim poder usar eles dentro do loop
		int pares [] = new int[nums.length];
		int impares [] = new int[nums.length];
		
		// if denntro de um loop para ele fazer a checagem de cada valor e atribuílos ao novo vetor
		for (int i = 0; i <= nums.length - 1; i++ ) {
			if (nums [i] % 2 == 0) {
				pares[i] = nums[i];
			} else {
				impares[i] = nums[i];
			}
			
		}
		
		// falando que se algum valor no vetor tiver o valor zero para não imprimi-lo
		System.out.print("Númeors pares: ");
		for (int num : pares) {
			
			if (num == 0) {
				continue;
				} else {
				System.out.printf(num + " ");								
				}
		}
		
		System.out.println();
		System.out.print("Números ímpares: ");
		
		for (int num : impares) {
			if (num == 0) {
				continue;
				} else {
				System.out.printf(num + " ");								
				}
		}
		
		scn.close();
	}

}
