package aula1;

import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		java.util.Scanner scn = new Scanner(System.in);
		
		String nome1, nome2;
		
		Double altura1, altura2, mediaAltura;
		
		System.out.print("digite o primeiro nome");
		nome1 = scn.nextLine();
		
		System.out.print("digite o segundo nome");
		nome2 = scn.nextLine();
		
		System.out.print("digite a primeira altura");
		altura1 = scn.nextDouble();
		
		System.out.print("digite a segunda altura");
		altura2 = scn.nextDouble();
		
		mediaAltura = (altura1 + altura2) / 2;
		System.out.print("e a media de" + nome1 + " e" + nome2 + " é " + mediaAltura);
		
	

	}

}
