package aula1;

import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double largura, altura, area, perímetro, diagonal;
		
		System.out.print("digite a largura: ");
		largura = scn.nextDouble();
		
		System.out.print("digite a altura: ");
		altura = scn.nextDouble();
		
		area = largura * altura;
		System.out.print("a área é = " + area);
		
		perímetro = altura * 2 + largura * 2;
		System.out.print("  o perímetro é = " + perímetro);
		
		diagonal = Math.sqrt(altura * altura + largura * largura);
		Math.sqrt(diagonal);
		System.out.print("  a diagonal é = " + diagonal);
		

	}

}
