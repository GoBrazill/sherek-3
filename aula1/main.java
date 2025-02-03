package aula1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, media;
	 
		System.out.print("digite o primeiro número");
		x = sc.nextDouble();
		System.out.print("digite o segundo número");
		y = sc.nextDouble();
		media = (x + y) / 2.0;
		System.out.println("media =" + media);
		sc.close();

	}

}
