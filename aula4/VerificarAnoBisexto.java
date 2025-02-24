package aula1;

import java.util.Scanner;

public class VerificarAnoBisexto {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		
		int ano;
		double divisão1, divisão2;
		
		System.out.println("Digite o ano: ");
		ano = scn.nextInt();
	    
		divisão1 = ano / 100; 
		divisão2 = ano / 400; 
		
	    if (divisão1 == 0) System.out.println("Esse ano não é bisexto"); 
	    
		else if (divisão2 == 0) System.out.print("Esse ano é bisexto :D");
	    
	    scn.close();
	}

}
