package exercícios_19_05;

import java.util.Scanner;

public class CódigosPerdidos {
	// TENTEI COPIAR DO COPILOT E NÃO DEU CERTO

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String código, resultado ="", pares [];
		char letras;
		int repetirCont;
		
		System.out.println("Olá vamos desvendar alguns códigos?"
				+ "\n Digite o código aqui: ");
		código = scn.nextLine();
		
		pares = código.split("(?<=\\d)(?=\\D)");
		
		for (String par : pares) {
			repetirCont = Integer.parseInt(par.replaceAll("[^0-9]", ""));
			letras =  par.replaceAll("[^a-zA-Z]", "").charAt(0);
			
			resultado += String.valueOf(letras).repeat(repetirCont);
		}
		System.out.println("Aqui está: " + resultado);
		
	}

}
