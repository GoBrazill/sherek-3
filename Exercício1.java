package aula1;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		
		double largura, comprimento, valorMetro, area, custo ;
		
		System.out.print("digite a largura = ");
		largura = scn.nextDouble();
		
		System.out.print("digite o comprimento = ");
		comprimento = scn.nextDouble();
		
		System.out.print("digite o valor do metro = ");
		valorMetro = scn.nextDouble();
		
		area = largura * comprimento;
		System.out.printf("a area é: " + area);
		
		custo = area * valorMetro;
		System.out.printf("  o valor do piso é: "+ custo);
		
		scn.close();
		
	}

}
